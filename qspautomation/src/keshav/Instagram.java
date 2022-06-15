package keshav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://www.instagram.com");
     Thread.sleep(5000);
     driver.findElement(By.name("username")).sendKeys("keshav");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("asdkjf");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();
		Thread.sleep(1000);
		
	}

}
