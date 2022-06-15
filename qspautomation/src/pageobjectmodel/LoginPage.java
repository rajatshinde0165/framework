package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//declaration
@FindBy(name="username")	private WebElement usn;
@FindBy(name="pwd")private WebElement pass;
@FindBy(id="loginButton")private WebElement loginBtn;
@FindBy(id="keepLoggedInCheckBox")private WebElement keeplogdecheckbox;
@FindBy(xpath="//img[contains(@src,'timer')]")private WebElement logo;
@FindBy(id="licenseLink")private WebElement licenseLink;


	
	
	
	//initialization
public LoginPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}
	
	
	
	
	//utilization
public WebElement getUsn() {
	return usn;
}

public WebElement getPass() {
	return pass;
}
public WebElement getLoginBtn() {
	return loginBtn;
}
public WebElement getKeeplogdecheckbox() {
	return keeplogdecheckbox;
}
public WebElement getLogo() {
	return logo;
}
public WebElement getLicenseLink() {
	return licenseLink;
}



//generic reusable method
public void loginpage(String validusername,String validpassword)
{
	usn.sendKeys(validusername);
	pass.sendKeys(validpassword);
	loginBtn.click();
	
}
public void invalidlogin(String validusername,String validpassword) throws InterruptedException
{
	usn.sendKeys(validusername);
	pass.sendKeys(validpassword);
	loginBtn.click();
Thread.sleep(400);
	usn.clear();
}

}
