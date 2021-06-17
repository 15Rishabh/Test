package TestNG;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assertion extends BaseTest{
	
	
	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("ahghghgh");
	driver.findElement(By.id("pass")).sendKeys("gjgyufgjhggy");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	Assert.assertEquals(title,"qwerty12345");
	//SoftAssert s=new SoftAssert();
	//s.assertEquals(title,"yghjjhgghg");
	Reporter.log(title,true);
	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
	//s.assertAll(); {

}
}