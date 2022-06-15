package OperationalMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/rajat/OneDrive/Desktop/Html/multiselectdropdown.html");
		WebElement list = driver.findElement(By.id("menu"));
		Select sel = new Select(list);
		WebElement rt = sel.getWrappedElement();
		String text = rt.getText();
		System.out.println(text);
	}

}
