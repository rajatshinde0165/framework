package DataDrivenFrameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

class testScript extends BaseTest  {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	BaseTest bs = new BaseTest();
	bs.SetUp("chrome", "https://opensource-demo.orangehrmlive.com/");
	Flib flib = new Flib();
	Thread.sleep(4000);
	String username = flib.readExcelData("./data/hhh.xlsx","rj", 1, 0);
	String password = flib.readExcelData("./data/hhh.xlsx","rj", 1, 1);
	
driver.findElement(By.name("txtUsername")).sendKeys(username);
driver.findElement(By.name("txtPassword")).sendKeys(password);
driver.findElement(By.name("Submit")).click();	
		

	}

}
