package Method;

import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitMethod {
  public static void main(String[]args) throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	 FirefoxDriver driver=new FirefoxDriver();
	 driver.get("https://omayo.blogspot.com/");
	 Thread.sleep(3000);
	 driver.quit();
  }

}
