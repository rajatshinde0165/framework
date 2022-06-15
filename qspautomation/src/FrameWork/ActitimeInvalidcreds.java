package FrameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeInvalidcreds {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	 
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1/login.do;jsessionid=3e3ftr8d0g8k0");
			Flidge rj = new Flidge();
			 int rc = rj.getrowCount("./data/Actitime.xlsx", "invalidcreds");
			for(int i=0;i<=rc;i++)
			{
				String usernmae = rj.readData("./data/Actitime.xlsx","invalidcreds", i,0 );
				
				String password = rj.readData("./data/Actitime.xlsx","invalidcreds", i,1);
				
				driver.findElement(By.name("username")).sendKeys(usernmae);
				driver.findElement(By.name("pwd")).sendKeys(password);
				
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(4000);
				driver.findElement(By.name("username")).clear();
				
				
				
			}
			}

	}


