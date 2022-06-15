package DropdownDeselect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultidropSelectByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
 driver.get("file:///C:/Users/rajat/OneDrive/Desktop/Html/multiselectdropdown.html");
 WebElement dropdown = driver.findElement(By.id("menu"));
 Select sel = new Select(dropdown);
 sel.selectByIndex(4);
 Thread.sleep(4000);
 sel.deselectByIndex(4);

	}

}
