package keshav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.gecko.driver" , "./drivers/geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			driver.get("https:/www.google.com");
			Thread.sleep(5000);
           driver.close();
	}

}
