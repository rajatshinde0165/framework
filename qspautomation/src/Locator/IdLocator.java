package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/rajat/OneDrive/Desktop/Html/login.html");
driver.findElement(By.id("i1")).sendKeys("admin");
driver.findElement(By.id("i2")).sendKeys("rajat");
	}

}
