package Assignment;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 
	driver.get("https://www.ebay.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple Watches");
	WebElement dropdown = driver.findElement(By.id("gh-cat"));
Select sel = new Select(dropdown);
	sel.selectByVisibleText("Jewelry & Watches");
	driver.findElement(By.id("gh-btn")).click();
  
	System.out.println("-------result-------");
	String res = driver.findElement(By.xpath("//h1[text()='+ results for ']")).getText();
	System.out.println(res);
	
	System.out.println("-------allproduct-------");
	
	
	
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='srp-river-results clearfix']"));
	for (WebElement listprod : list) {
		String all = listprod.getText();
		System.out.println(all);
		}
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	for(int i=0;i<15;i++) {
		
		//scroll down
		jse.executeScript("window.scrollBy(0,5000)");
	}
	
		
		System.out.println("-------nthproduct-------");
		Scanner sc=new Scanner(System.in);
		System.out.println("type product number");
		Thread.sleep(4000);
		int nth = sc.nextInt();
		Thread.sleep(4000);
		String raj = String.format("//div[@class='srp-river-results clearfix']/ul/li", nth);
		String fg = driver.findElement(By.xpath(raj)).getText();
		System.out.println(fg);
		
	}
	
	}
	


