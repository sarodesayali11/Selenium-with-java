package Open_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Flipcart
{
	public static void main(String[] args)throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	WebElement Login = driver.findElement(By.id("login-button"));
     	Login.click();
     	WebElement closeLoginPopup = driver.findElement(By.xpath("//button[contains(text(), '✕')]"));
        closeLoginPopup.click();
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        loginButton.click();
}

	

}





