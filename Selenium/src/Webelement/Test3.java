package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
      WebElement ele = driver.findElement(By.xpath("//div[@class=\"floatL\"]"));
		//WebElement ele = driver.findElement(By.name("remember"));
	System.out.println(ele.getText());
	driver.close();
	}

}