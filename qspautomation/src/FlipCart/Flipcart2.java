package FlipCart;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart2 {
	
		public static void main(String[] args) throws InterruptedException {
			
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("laptop..");
driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/descendant::div[.='Lenovo Core i3 10th Gen - (8 GB/512 GB SSD/Windows 11 Home) 15IML05 Thin and Light Laptop']")).click();
	Thread.sleep(4000);
	Set<String> handel = driver.getWindowHandles();
	Thread.sleep(4000);
	for (String cartwindow : handel) {
		driver.switchTo().window(cartwindow);
		
	}
	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}
	}

