package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
	
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver.findElement(By.xpath("//a[Contains(Text(),'Log')]")).click();
	
	
	}

}
