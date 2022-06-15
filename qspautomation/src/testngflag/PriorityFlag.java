package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
@Test(priority = 0)
public void f1() {
	Reporter.log("f1",true);	
}
@Test()
public void a() {
	Reporter.log("f2",true);	
}
@Test(priority = 1)
public void f3() {
	Reporter.log("f3",true);	
}
@Test(priority = 2)
public void f4() {
	Reporter.log("f4",true);
	
	
}

}
