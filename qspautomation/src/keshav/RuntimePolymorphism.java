package keshav;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RuntimePolymorphism {
public static void main(String[]args) throws InterruptedException
{
	WebDriver driver;
	
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the browser which you want");
String browservalue=sc.nextLine();


if(browservalue.equalsIgnoreCase("chrome"))
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	
}
else if(browservalue.equalsIgnoreCase("firefox"))
{
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	
	
}
else
{
	System.out.println("enter valid input");
}

}

}
