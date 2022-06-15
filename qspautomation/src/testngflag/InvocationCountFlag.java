package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
	@Test(invocationCount = 1000)
	public void f() {
		Reporter.log("f",true);
		
		
	}
}
