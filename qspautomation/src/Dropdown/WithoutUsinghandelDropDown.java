package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsinghandelDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/rajat/OneDrive/Desktop/Html/singleselectdropdown.html");
		List<WebElement> alloption = driver.findElements(By.xpath("//select[@id='menu']/descendant::option "));
		
		for(int i=0;i<alloption.size();i++) {
			WebElement ss = alloption.get(i);
			String text = ss.getText();
			
			
			if(alloption.get(i).getText().contains("Upma")) {
				alloption.get(i).click();
				break;
				
			}
			
			//
		}
		
		
		
	}
	
	

}
