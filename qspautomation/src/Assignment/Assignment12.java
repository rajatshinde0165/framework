package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Assignment12 {
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
driver.findElement(By.xpath("//span[text()='Upto 30% Off on Making Charges']")).click();
List<WebElement> price = driver.findElements(By.xpath("//span[@class='p-wrap']"));
for (WebElement webElement : price) {
	String tt = webElement.getText();
	System.out.println(tt);
	
}
}
}
