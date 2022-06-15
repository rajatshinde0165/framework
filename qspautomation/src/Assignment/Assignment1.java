package Assignment;


	

	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	public class Assignment1 {
public static void main(String[]args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("Qspider");
		Thread.sleep(4000);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_ENTER);
		WebElement fd = driver.findElement(By.xpath("//div[text()='QSpiders']"));
		Actions act = new Actions(driver);
		act.doubleClick(fd).perform();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_C);
	
		

	}
	}


