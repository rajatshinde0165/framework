package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabledflag {
	@Test(enabled = true)
	public void f() {
		Reporter.log("f",true);
	}
	@Test(enabled = false)
	public void f1() {
		Reporter.log("f",true);	
	}

}
