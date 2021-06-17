package Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Rishabh");
		driver.findElement(By.name("password")).sendKeys("Selenium");
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Instagram"))
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