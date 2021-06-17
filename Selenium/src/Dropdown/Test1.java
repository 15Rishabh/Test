package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.Facebook.com/");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[@role='button']")).click();
    WebElement ele = driver.findElement(By.id("month"));
    
    Select s=new Select (ele);
    
    s.selectByIndex(0);
    Thread.sleep(2000);
    s.selectByValue("2");
    Thread.sleep(2000);
    s.selectByVisibleText("Mar");
    Thread.sleep(2000);
    
    s.deselectByIndex(0);
    Thread.sleep(2000);
    s.deselectByValue("2");
    Thread.sleep(2000);
    s.deselectByVisibleText("Mar");
    Thread.sleep(2000);
    
    driver.close();
    
	}
}