package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	
	public void demo() {
		
		Reporter.log("hello seleniun,true");
		Reporter.log("hello java,false");
	}

}