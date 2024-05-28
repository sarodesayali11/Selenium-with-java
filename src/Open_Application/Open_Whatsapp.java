package Open_Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Whatsapp 
{
	public static void main(String[] args)
	{
		System.out.println("hi");
		System.setProperty("webdriver.chorme.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();

		
		driver.get("https //web.whatsapp.com ");
		driver.manage().window().maximize();
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
	   }

	}




