package pageobjectmodel2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {
	WebDriver driver;
	
	public void setUp() throws IOException {
		Flib flib = new Flib();
		String browservalue = flib.getProperty("./data/config.properties", "browser");
		String url = flib.getProperty("./data/config.properties", "url");
		
		
		if (browservalue.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.setProperty("webdriver.driver.chrome", "./drivers/chromedriver.exe");
			driver.manage().window().maximize();
			 driver.get(url);	
		}
		else if(browservalue.equalsIgnoreCase("firefox")) {
			
				driver=new ChromeDriver();
				System.setProperty("webdriver.driver.chrome", "./drivers/chromedriver.exe");
				driver.manage().window().maximize();
				 driver.get(url);	
		}
	}

}
