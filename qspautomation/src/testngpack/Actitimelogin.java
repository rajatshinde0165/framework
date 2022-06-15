package testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Actitimelogin {
	WebDriver driver;
  @Test
  @Parameters({"browser","username","password","url"})
  public void setup(String browservalue,String username,String password,String url) {
	  if(browservalue.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("pwd")).sendKeys(password);
	  driver.findElement(By.id("loginButton")).click();  
  }
}
}