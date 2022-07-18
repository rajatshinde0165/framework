package Assignment;


	

	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;
	public class Assignment1 {
public static void main(String[]args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("Qspider");
		Thread.sleep(4000);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		WebElement fd = driver.findElement(By.xpath("//div[text()='QSpiders']"));
		Actions act = new Actions(driver);
		act.doubleClick(fd).perform();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_C);
		ro.keyRelease(KeyEvent.VK_C);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		
	
		TakesScreenshot dri = (TakesScreenshot)driver;
		File src = dri.getScreenshotAs(OutputType.FILE);
		File file = new File("./ScreeShot/rja.png");
	     Files.copy(src, file);
		
		

	}
	}


