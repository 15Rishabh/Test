package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		WebElement ele = driver.findElement(By.id("txtlogin"));
		Point loc = ele.getLocation();
		System.out.println("The x coordinates "+loc.getX());
		System.out.println("The y coordinates "+loc.getY());
		driver.close();

	}

}