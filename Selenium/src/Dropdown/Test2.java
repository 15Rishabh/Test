package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://demoapp.skillrary.com/");
    WebElement ele = driver.findElement(By.id("cars"));
    
    Select s=new Select (ele);
    Thread.sleep(3000);
    s.selectByIndex(1);
    Thread.sleep(3000);
    s.selectByValue("199");
    Thread.sleep(3000);
    s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
    Thread.sleep(3000);
    
    s.deselectByIndex(1);
    Thread.sleep(3000);
    s.deselectByValue("199");
    Thread.sleep(3000);
    s.deselectByVisibleText("INR 200 - INR 299 ( 3 ) ");
    Thread.sleep(3000);
    driver.close();
    
    
    
	
	}

}