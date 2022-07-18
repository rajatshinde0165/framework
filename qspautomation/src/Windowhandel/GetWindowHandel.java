package Windowhandel;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		String get = driver.getWindowHandle();
		System.out.println(get);
		Set<String> got = driver.getWindowHandles();
		System.out.println(got);
		
		

	}

}
