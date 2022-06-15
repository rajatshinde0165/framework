package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOPtionsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
 driver.get("file:///C:/Users/rajat/OneDrive/Desktop/Html/multiselectdropdown.html");
 WebElement dropdown = driver.findElement(By.id("menu"));
 Select sel = new Select(dropdown);
List<WebElement> ops = sel.getOptions();
/*for(int i=0;i<ops.size();i++) {
WebElement opt=ops.get(i);
String text = opt.getText();
	System.out.println(text);
}
           OR
*/
for (WebElement text : ops) {
	String list = text.getText();
	System.out.println(list);
	
}
}
}
