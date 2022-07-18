package ScreenshotDynamically;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(CoustomListner.class)
public class TestScript extends BaseTest {
	@BeforeMethod
	public void setUp(){
		initialization();
	}
	
	@Test
	public void login() {
		SoftAssert softassert = new SoftAssert();
		String pagetittle = driver.getTitle();
		softassert.assertEquals(pagetittle, "OrangeHRM");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin12");
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
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
