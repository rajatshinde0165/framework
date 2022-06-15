package pageobjectmodel2;

import java.io.IOException;

import pageobjectmodel.BaseTest;

public class ActitimeValidlogin {
public static void main(String[] args) throws IOException, InterruptedException {
	Flib flib = new Flib();
	BaseTest bt = new BaseTest();
	String username = flib.readExcelData("./data/Actitime.xlsx", "Sheet1", 1, 0);
	
	
	bt.setUpBrowser();
	
}
}
