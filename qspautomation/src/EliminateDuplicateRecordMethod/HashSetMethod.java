package EliminateDuplicateRecordMethod;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
 driver.get("file:///C:/Users/rajat/OneDrive/Desktop/Html/multiselectdropdown.html");
 WebElement dropdown = driver.findElement(By.id("menu"));
Select sel = new Select(dropdown);
List<WebElement> option = sel.getOptions();
HashSet<String> s = new HashSet<String>();//declare set to  eliminate duplicate record
for(int i=0;i<option.size();i++) {//read the list and get text
	WebElement tete = option.get(i);
	String text = tete.getText();
	s.add(text);//add text to set and wont be accepted the duplicates records
}
for (String read : s) {
	System.out.println(read);
	
}
	}

}
