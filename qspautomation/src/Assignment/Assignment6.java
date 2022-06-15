package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.Assert;
import graphql.util.TraverserState.EndList;
import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class Assignment6 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("denyBtn")).click();
	Thread.sleep(4000);
	WebElement rin = driver.findElement(By.xpath("//span[@class='caret hs']/ancestor::a[@title='Rings']"));
	Thread.sleep(4000);
	Actions act = new Actions(driver);
	Thread.sleep(4000);
	act.moveToElement(rin).perform();
	driver.findElement(By.xpath("//ul[@class='two-col']//ancestor::a[@title='Diamond Rings']")).click();
	List<WebElement> defaultprice = driver.findElements(By.xpath("//span[@class='new-price']"));
	for (WebElement list : defaultprice) {
		String alllist = list.getText();
		System.out.println(alllist);
		
	}
	Thread.sleep(4000);
	WebElement ash = driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"));
	act.moveToElement(ash).perform();
	 driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
	List<WebElement> lowtohigh = driver.findElements(By.xpath("//span[@class='new-price']"));
	
	for (WebElement low : lowtohigh) {
		String rj = low.getText();
		System.out.println(rj);	
	}
	
	if(defaultprice.equals(lowtohigh)) {
System.out.println("default price and sorted price are same");
	}
	else
	{
		System.out.println("default price and sorted price are not same");
	}
	
	List<String> obj=new ArrayList<>();
	List<WebElement> fr = driver.findElements(By.xpath("//span[@class='new-price']"));
	for (WebElement webElement : fr) {
		String vv = webElement.getText();
		obj.add(vv);
		
	}
	Collections.sort(obj);
	System.out.println(obj);
	for(int i=0;i<obj.size();i++) {
		
	if(lowtohigh.equals(obj.get(i))) {
		System.out.println("it is sorted and filtervalue are same");
		
	}
	System.out.println("it is sorted and filtervalue are not same");
}
	}
	
	}


