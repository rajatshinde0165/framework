
package EliminateDuplicateRecordMethod;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSetMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
 driver.get("file:///C:/Users/rajat/OneDrive/Desktop/Html/multiselectdropdown.html");
 WebElement dropdown = driver.findElement(By.id("menu"));
Select sel = new Select(dropdown);
List<WebElement> option = sel.getOptions();
TreeSet<String> s = new TreeSet<String>();
for(int i=0;i<option.size();i++) {
	WebElement text = option.get(i);
	String tx = text.getText();
	s.add(tx);
}
for (String rj : s) {
	System.out.println(rj);
}
	



}
}