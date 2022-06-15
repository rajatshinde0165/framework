package pageobjectmodel;

import java.io.IOException;

public class ActitimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUpBrowser();
		Flib flib = new Flib();
		String username = flib.readProperties("./data/config.properties","username" );
	String password = flib.readProperties("./data/config.properties", "password");
 LoginPage lp = new LoginPage(driver);
 lp.loginpage(username, password);
	}

}
