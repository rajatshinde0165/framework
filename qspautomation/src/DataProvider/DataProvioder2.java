package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvioder2 {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=bgk9qg1btpcd6");
	}
	@DataProvider(name="actitimeinvalidcreds")
	public Object[][] dataprovider(){
		
		
	      Object[][] obj=new Object[5][2];
	      
	      
	      obj[0][0]="admin1";
	      obj[0][1]="manager2";
	      
	      obj[1][0]="adm in1";
	      obj[1][1]="man ager2";
	      
	      obj[2][0]="adm@in1";
	      obj[2][1]="ma@nager2";
	      
	      obj[3][0]="adm32123in1";
	      obj[3][1]="man45ager2";
	      
	      obj[4][0]="545123";
	      obj[4][1]="54456";
	      
	      
	      
		return obj;
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	@Test(dataProvider = "actitimeinvalidcreds")
	public void login(String username,String password) throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		
	}

}
