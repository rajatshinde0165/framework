package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValueMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/rajat/OneDrive/Desktop/Html/singleselectdropdown.html");
 WebElement dropdown = driver.findElement(By.id("menu"));
 Select sel = new Select(dropdown);
 Thread.sleep(4000);
 sel.selectByValue("v12");
	}

}
