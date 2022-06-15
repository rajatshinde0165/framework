package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependentFlg {
	@Test(dependsOnMethods = "a")
	public void b() {
		Reporter.log("b",true);	
	}
	@Test()
	public void a() {
		Reporter.log("a",true);
		
		
	}

}
