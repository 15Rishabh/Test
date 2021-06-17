package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test4 {

	public static void main(String[] args) throws AWTException {
	
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
         driver.findElement(By.linkText("3.141.59")).click();
         
         Robot r=new Robot();
         r.keyPress(KeyEvent.VK_CONTROL);
         r.keyPress(KeyEvent.VK_TAB);
         r.keyPress(KeyEvent.VK_TAB);
         r.keyPress(KeyEvent.VK_TAB);
         
         r.keyRelease(KeyEvent.VK_CONTROL);
         r.keyRelease(KeyEvent.VK_TAB);
         r.keyRelease(KeyEvent.VK_TAB);
         r.keyRelease(KeyEvent.VK_TAB);
         


	}

}
