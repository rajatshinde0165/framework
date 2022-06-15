package TestngAssertion;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;													

class TestngAssertion{
	WebDriver driver;
	@BeforeTest
	public void setProperty() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	
	
	@Test
	public void testCase() 
	{
		SoftAssert softassert = new SoftAssert();
		String pagetittle = driver.getTitle();
		softassert.assertEquals(pagetittle, "OrangeHRM");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		WebElement dashboard = driver.findElement(By.xpath("//h1[.=Dashboard]"));
		boolean status = dashboard.isDisplayed();
		Assert.assertEquals(status, true);
		String homepage = driver.getTitle();
		softassert.assertEquals(homepage, "OrangeHRMHomepage");
		Reporter.log("createuser", true);
		Reporter.log("createcontact", true);
		softassert.assertAll();
	}
}