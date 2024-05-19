package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myswaglab {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	       // System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();// open the browser

	       driver.manage().window().maximize();// maximize the windows
	       driver.get("https://www.saucedemo.com");
	       WebElement username = driver.findElement(By.id("user-name"));
	       WebElement password = driver.findElement(By.id("password"));

	       Thread.sleep(1000);
	       username.sendKeys("standard_user");
	       Thread.sleep(1000);
	       password.sendKeys("secret_sauce");

	       WebElement Login = driver.findElement(By.id("login-button"));
	       // id="login-button"
	       Login.click();
	       Thread.sleep(1000);
	       // Switch to Product Page
	       String currentwindowHandle = driver.getWindowHandle();
	       driver.switchTo().window(currentwindowHandle);

	       // Sauce Labs Bolt T-Shirt
	       driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
	       Thread.sleep(1000);

	       // Switch to Product Page
	       String currentwindowHandle1 = driver.getWindowHandle();
	       driver.switchTo().window(currentwindowHandle1);

	       // driver.findElement(By.className("btn_primary btn_inventory")).click();
//	       driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	  WebElement cart= driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]"));
	  cart.click();
	  Thread.sleep(100);

	       System.out.println("hi");
	       
	       //driver.close();
	   }
	}


