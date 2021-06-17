package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/rio/login");
		driver.findElement(By.id("signInName")).sendKeys("Rishabh");
		driver.findElement(By.id("password")).sendKeys("Selenium");
		driver.findElement(By.id("signInbtn")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Jobseeker's Sign in - Search & Apply to Latest Jobs Online | MonsterIndia"))
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