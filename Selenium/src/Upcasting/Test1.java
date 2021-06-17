package Upcasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
public static void generic(WebDriver driver) {
	driver.get("https://skillrary.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
}
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
            Test1.generic(driver);
	

}
}