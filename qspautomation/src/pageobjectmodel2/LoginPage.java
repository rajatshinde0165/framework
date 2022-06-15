package pageobjectmodel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(name="usename")private WebElement usn;
	


	@FindBy(name="pwd")private WebElement password;
	@FindBy(id="loginButton")private WebElement login;
	//initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	

	//generic reusable method
	
	public void ActitimeValid() {
		usn.sendKeys("admin");
		password.sendKeys("manager");
		login.click();
	}
	
	}
	


