package TestNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTest{
	
	
	@Test
	public void testcase2() {
		driver.findElement(By.linkText("Forgotten password?")).click();
	Reporter.log(driver.getTitle(),true);
	Reporter.log(driver.getCurrentUrl(),true);
	}
	
	
	
	
	

}