package keyworddriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoconstant {
	static WebDriver driver;
public void setUp() throws EncryptedDocumentException, IOException {
	Flib flib = new Flib();
	String url = flib.readProperties(PROP_PATH, "url");
	String browser= flib.readProperties(PROP_PATH, "browser");

	if(browser.equalsIgnoreCase("chrome")) {
	
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get(url);
	}
	
	else if(browser.equalsIgnoreCase("firefox")) {
		
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
		}
}
public void tearDown() {
	driver.quit();
}
}
