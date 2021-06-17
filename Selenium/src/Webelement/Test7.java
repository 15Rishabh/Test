package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		
		
		WebElement usTb = driver.findElement(By.id("txtlogin"));
		if(usTb.isDisplayed()) {
			System.out.println("Pass:element is dispalyed");
			usTb.sendKeys("Rishabh");
		}
		else
		{
			System.out.println("Fail:element is not dispalyed");
		}
		
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        if(loginBtn.isEnabled())
        {
	    System.out.println("Pass:element is enabled");
	    loginBtn.click();
        }
        else
        {
	    System.out.println("Fail:element is not enabled");
        }
	
	
	   WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
       if(checkbox.isSelected())
       {
	   System.out.println("Pass:elemnt is selected");
       }
       else
       {
   	   System.out.println("Fail:element is not selected");
}
driver.close();
}
}