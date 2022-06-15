package WebelementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 
 driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	  WebElement text = driver.findElement(By.name("q"));
	 String trg = text.getText();
	 System.out.println(trg);
	}
	}
