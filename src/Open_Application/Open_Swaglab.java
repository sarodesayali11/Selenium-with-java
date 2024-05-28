package Open_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Swaglab 
{
	public static void main(String[] args) throws InterruptedException 
	{	

			
				System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.saucedemo.com/v1");
				driver.manage().window().maximize();
				WebElement name= driver.findElement(By.id("user-name"));
				name.sendKeys("standard_user"); 
				WebElement pass= driver.findElement(By.id("password"));
				pass.sendKeys("secret_sauce");
				WebElement Login = driver.findElement(By.id("login-button"));
			     	Login.click();
			       Thread.sleep(1000);
			       String currentwindowHandle = driver.getWindowHandle();
			       driver.switchTo().window(currentwindowHandle);
			       driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
			       Thread.sleep(1000);
			       String currentwindowHandle1 = driver.getWindowHandle();
			       driver.switchTo().window(currentwindowHandle1);
			       driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			       Thread.sleep(1000);
			       driver.findElement(By.xpath("//*[@id='shopping_cart_container']")).click();
			       String currentwindowHandle2 = driver.getWindowHandle();
			       driver.switchTo().window(currentwindowHandle2);
			       Thread.sleep(1000);
			       driver.findElement(By.linkText("CHECKOUT")).click();
			       String currentwindowHandle3 = driver.getWindowHandle();
			       driver.switchTo().window(currentwindowHandle3);
			       Thread.sleep(1000);
			       WebElement firstname= driver.findElement(By.id("first-name"));
			       firstname.sendKeys("Sayali");
			       WebElement lastname=driver.findElement(By.id("last-name"));
			       lastname.sendKeys("Sarode");
			       WebElement postalcode= driver.findElement(By.id("postal-code"));
			       postalcode.sendKeys("444108");
			       driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
			       String currentwindowHandle4 = driver.getWindowHandle();
			       driver.switchTo().window(currentwindowHandle4);
			       Thread.sleep(1000);
			       driver.findElement(By.linkText("FINISH")).click();
			       String currentwindowHandle5 = driver.getWindowHandle();
			       driver.switchTo().window(currentwindowHandle5);
			       Thread.sleep(1000);
			       

			   }

			}
		

		


