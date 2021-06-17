package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		WebElement ele = driver.findElement(By.id("txtlogin"));
          ele.clear();
          Thread.sleep(5000);
          ele.sendKeys("Rishabh");
          Thread.sleep(5000);
          driver.close();
	}

}