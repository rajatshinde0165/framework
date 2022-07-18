package WindowbasePopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile1 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			 
		driver.get("http://127.0.0.1/login.do;jsessionid=fb68ptmxgrnd");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='content administration']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(4000);
	WebElement target = driver.findElement(By.xpath("//input[@type='file']"));
	Actions act = new Actions(driver);
	act.doubleClick(target).perform();
Thread.sleep(4000);
Runtime.getRuntime().exec("D:\\nb.exe");

Robot rb = new Robot();
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);
Runtime.getRuntime().exec("D:\\nb.exe");
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
