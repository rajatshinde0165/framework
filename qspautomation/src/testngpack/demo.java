package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
  @Test
  public void method1() {
	  int a=0;
	  int res=54/a;
	Reporter.log("method1 execute",true);
	  
  }
  @Test
  public void method2() {
	  
	Reporter.log("method2 execute",true);
	  
  }
  @Test
  public void method3() {
	  
	Reporter.log("method3 execute",true);
	  
  }


}
