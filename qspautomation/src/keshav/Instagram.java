package keshav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://www.instagram.com");

 
   WebDriverWait wb = new WebDriverWait(driver, 30);
   wb.until(ExpectedConditions.titleContains("username"));
     driver.findElement(By.name("username")).sendKeys("keshav");
     
		driver.findElement(By.name("password")).sendKeys("asdkjf");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();
		Thread.sleep(1000);
		
	}

}
