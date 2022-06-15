package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("car");
		Thread.sleep(8000);
		List<WebElement> getsuggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		for (WebElement sugg: getsuggestion) {
			String textofweblemen=sugg.getText();
			System.out.println(textofweblemen);
		}
	}

}
