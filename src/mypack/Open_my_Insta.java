package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_my_Insta{

	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("username"));
		username. sendKeys("shreyaah_2307");
		Thread.sleep(100);
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("aj@123shreya");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();
		
	}

}