package EliminateDuplicateRecordMethod;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedHashSetMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
 driver.get("file:///C:/Users/rajat/OneDrive/Desktop/Html/multiselectdropdown.html");
 WebElement dropdown = driver.findElement(By.id("menu"));
Select sel = new Select(dropdown);
 List<WebElement> options = sel.getOptions();
LinkedHashSet<String> s = new LinkedHashSet<String>();
 for(int i=0;i<options.size();i++)
 {
	 WebElement text = options.get(i);
	 String te = text.getText();
	 s.add(te);
 }
 for (String raj : s) {
	System.out.println(raj);
}
	}

}
