package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/droppable/webpage");
driver.findElement(By.xpath("//a[text()='Demos']")).click();
driver.findElement(By.xpath("//a[text()='Droppable']")).click();
Thread.sleep(4000);

driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
 WebElement src = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
 
 WebElement dest = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
Thread.sleep(4000);

Actions act = new Actions(driver);
act.dragAndDrop(src, dest).perform();
driver.switchTo().defaultContent();
}

}
