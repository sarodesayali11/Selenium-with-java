package mypack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_My_whats 
{

	public static void main(String[] args)
	{
		System.out.println("hi");
		System.setProperty("webdriver.chorme.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();

		//create varibale for child class and assigning it
		//to variable of parent class : upcating
		   
		driver.get("https //web.whatsapp.com ");
		driver.manage().window().maximize();
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
	   }

	}


