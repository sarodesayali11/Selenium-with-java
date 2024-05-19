package Selenium_Pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_my_Insta.java{

	private static WebElement username;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("darshanhadole121@gmail.com");

		/// driver.findElement(By.id("email")).sendKeys("darshanhadole121@gmail.com");

		Thread.sleep(100);

		WebElement password = driver.findElement(By.name("password"));
		// password.sendKeys("8055805555");
		password.sendKeys("80558055");

		Thread.sleep(100);

		// driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();

		//// *[@id="loginForm"]/div/div[3]
		Thread.sleep(100);
		// driver.findElement(By.className("_acan _acap _acas _aj1- _ap30")).click();

		// _acan _acap _acas _aj1- _ap30
	}

}
	