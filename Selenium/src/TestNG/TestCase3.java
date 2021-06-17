package TestNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest{
	
	@Test
	public void tc3() {
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.xpath("//div[text()='Get Started']")).click();
		Reporter.log(driver.getTitle(),true);
		Reporter.log(driver.getCurrentUrl(),true);
	}
	
	

}