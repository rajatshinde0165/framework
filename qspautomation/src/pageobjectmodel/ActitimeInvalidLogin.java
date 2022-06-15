package pageobjectmodel;

import java.io.IOException;

public class ActitimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		Flib flib=new Flib();
		bt.setUpBrowser();
		LoginPage lp = new LoginPage(driver);
		int rc = flib.getRowcount("./data/Actitime.xlsx","invalidcreds" );
	 
		for(int i=0;i<=rc;i++)
		{
			String username = flib.readexceldata("./data/Actitime.xlsx","invalidcreds", i,0 );
			String password = flib.readexceldata("./data/Actitime.xlsx","invalidcreds", i,1);
			lp.invalidlogin(username, password);
		}
		
		
	
	}

}
