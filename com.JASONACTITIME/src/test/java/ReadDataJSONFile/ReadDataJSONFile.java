package ReadDataJSONFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;









public class ReadDataJSONFile {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe")	;
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.get("http://127.0.0.1/login.do;jsessionid=3wl9hm5uvl9sr");
	}
  @Test
  public void ActitimeValidLogin() throws IOException, ParseException {
	  
	 JSONParser json=new JSONParser();
	  FileReader jsonf = new FileReader("./data/rajat.json");
	  Object obj = json.parse(jsonf); 
	  JSONObject jobj=(JSONObject) obj;
	 String username= (String)jobj.get("username");
	 String password= (String)jobj.get("password");
	 driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
  }
  
  @AfterMethod
  public void tearDown() {
	  
	  driver.close();
  }
  }

