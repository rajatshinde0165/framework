package Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassLocator {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.get("https://www.google.com");
	
	Point p = new Point(400, 500);
	driver.manage().window().setPosition(p);
	
	
	driver.findElement(By.name("q")).sendKeys("ross geller",Keys.ENTER);
	driver.findElement(By.className("lNPNe")).click();
}
}
