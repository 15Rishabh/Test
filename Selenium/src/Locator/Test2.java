package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Forgotten password?")).click();
	driver.findElement(By.id("identify_email")).sendKeys("1234");
	driver.findElement(By.name("did_submit")).click();

	

	}

}