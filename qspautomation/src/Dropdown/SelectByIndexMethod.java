package Dropdown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SelectByIndexMethod {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("file:///C:/Users/rajat/OneDrive/Desktop/Html/singleselectdropdown.html");
WebElement dropdownelement = driver.findElement(By.id("menu"));
Select sel = new Select(dropdownelement);
Thread.sleep(4000);
sel.selectByIndex(4);
File d = driver.getScreenshotAs(OutputType.FILE);
File src = new File("./ScreenShot/ee.png");
Files.copy(d, src);





	

	}

}
