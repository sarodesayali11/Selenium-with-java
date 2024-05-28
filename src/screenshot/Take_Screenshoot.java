package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_Screenshoot
{
	public static void main(String[] args) throws IOException
	{
	 System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();//open the browzer
	  
	 driver.manage().window().maximize();//maximize the windows
	 driver.get("http://www.facebook.com/");
	 //take Screenshot
	 TakesScreenshot ts =(TakesScreenshot)driver;
	 File src = ((TakesScreenshot)ts).getScreenshotAs(OutputType.FILE);
	 File des = new File("C:\\Users\\INTEL\\Desktop\\screenshot//a.png");
	FileHandler.copy(src, des); 		
	 
		
		


	}

}



