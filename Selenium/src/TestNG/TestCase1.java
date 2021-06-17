package TestNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest{
	
	
	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("ahghghgh");
	driver.findElement(By.id("pass")).sendKeys("gjgyufgjhggy");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	Reporter.log(title,true);
	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
	}
	
	

}