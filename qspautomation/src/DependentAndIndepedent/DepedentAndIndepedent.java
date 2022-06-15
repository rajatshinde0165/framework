package DependentAndIndepedent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DepedentAndIndepedent {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 driver.findElement(By.xpath("//input[@name='q']")).click();
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop",Keys.ENTER);
	 
	  String text = driver.findElement(By.xpath("//div[text()='acer Swift 5 Core i7 11th Gen Intel EVO - (16 GB/1 TB SSD/Windows 10 Home) SF514-55TA-72VG Thin and Li...']")).getText();
	 
	 
}
	


}
