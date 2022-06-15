package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("denyBtn")).click();
	Thread.sleep(4000);
	WebElement tar = driver.findElement(By.xpath("//span[text()='Offers ']"));
	Actions act = new Actions(driver);
	act.moveToElement(tar).perform();
	driver.findElement(By.xpath("//span[contains(text(),'10% Making')]")).click();
	List<WebElement> rj = driver.findElements(By.xpath("//span[@class='b-price-wrapper']"));
	for (WebElement web : rj) {
		String sd = web.getText();
		System.out.println(sd);
		
	}
}
}
