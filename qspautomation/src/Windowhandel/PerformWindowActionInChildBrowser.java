package Windowhandel;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PerformWindowActionInChildBrowser {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();

	co.addArguments("-start-maximized");
	WebDriver driver =new ChromeDriver(co);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	String add = driver.getWindowHandle();
	String sd = driver.getTitle();
	
	Set<String> add1 = driver.getWindowHandles();
	
	for (String asd : add1) {
		String sdd = driver.switchTo().window(asd).getTitle();
		
		if(!sd.equals(sdd)) {
			co.addArguments("-start-maximized");
			try {
			Thread.sleep(4000);
			}
			catch(Exception dr)
			{
				
			}
			driver.close();
			
		}
			
		
	}

	}
	}