package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.findElement(By.id("txtlogin")).sendKeys("Rishabh");
		driver.findElement(By.id("pass_box")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Rediff MyPage Login"))
		{
			System.out.println("pass:home page is displayed");
		}
		else
		{
			System.out.println("fail:home page is not dispalyed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}