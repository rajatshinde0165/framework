package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("denyBtn")).click();
	Thread.sleep(4000);
	driver.switchTo().frame("chat-widget");
	driver.findElement(By.xpath("//p[text()='CHAT with our experts !']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
