package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShortcutOfCssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input[name^='txtU']")).sendKeys("admin");// it is used match starting Character
		driver.findElement(By.cssSelector("input[name$='word']")).sendKeys("rajat123");//it is ending character of attribute value
		driver.findElement(By.cssSelector("input[name*='ubm']")).click();//used to any character in between or any match set of character in the attribute value

	}

}
