package keyworddriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActitimevalidLogin extends BaseTest {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		Flib flib = new Flib();
		BaseTest bt = new BaseTest();
		String username = flib.readProperties("./data/config.properties", "username");
		String password = flib.readProperties("./data/config.properties", "password");
       
		
		bt.setUp();
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		
		
		bt.tearDown();
	}

}
