package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("1234");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		


	}

}
