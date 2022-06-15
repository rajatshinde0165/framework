package pageobjectmodel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
static WebDriver driver;
	public void setUpBrowser() throws IOException, InterruptedException {
		Flib flib = new Flib();
		String browservalue  = flib.readProperties("./data/config.properties", "browser");
		String url = flib.readProperties("./data/config.properties", "url");
		
		
		
		
	
		if(browservalue.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get(url);
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get(url);	
		}
		else 
		{
			System.out.println("choose correct browser");
		}
		

	}

}
