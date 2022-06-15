package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

class MethodParllel{
	@Test
	public void a() {
		long threadId = Thread.currentThread().getId();
		Reporter.log(threadId+"  thread id",true);
		Reporter.log("method1",true);
		}
	

@Test
public void b() {
	long threadId = Thread.currentThread().getId();
	Reporter.log(threadId+"  thread id",true);
	Reporter.log("method2",true);
	}
}
