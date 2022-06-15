package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way1UsingUniqueAttribuite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("rajat");
		 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

}
