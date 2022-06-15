package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DiscriptionFlag {
	@Test(description = "this is method perform login operation")
	public void f() {
		Reporter.log("f",true);
		
		
	}

}
