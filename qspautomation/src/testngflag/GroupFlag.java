package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupFlag {

		@Test(groups = "functional")
		public void ft1() {
			Reporter.log("ft1", true);
		}
		@Test(groups = "functional")
		public void ft2(){
			Reporter.log("ft2", true);
		}
		@Test(groups = "smoke")
		public void st1() {
			Reporter.log("st1", true);
		}
		@Test(groups = "smoke")
		public void st2() {
			Reporter.log("st2", true);
		}
		@Test(groups = "smoke")
		public void st3() {
			Reporter.log("st3", true);
		}
		@Test(groups = "integration")
		public void it1() {
			Reporter.log("it1", true);
		}
		@Test(groups = "integration")
		public void it2() {														
			Reporter.log("it2", true);
		}
		@Test(groups = "integration")
		public void it3() {
			Reporter.log("it3", true);
		}
		@Test(groups = "integration")
		public void it4() {
			Reporter.log("it4", true);
		}
}
