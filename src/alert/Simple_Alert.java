package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Simple_Alert 
        {
     	     public static void main(String[] args) throws InterruptedException {
	            System.setProperty("webdriver.msedge.driver",
	                    "Driver\\msedgedriver.exe");
	            //System.setProperty("webdriver.msedge.driver", "driver\\msedgedriver.exe");
	            WebDriver driver = new EdgeDriver();// open the browser

	            driver.manage().window().maximize();// maximize the windows
	            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	            Thread.sleep(500);
	            driver.findElement(By.xpath("//input[@type='submit']")).click();
	            Thread.sleep(500);

	            Alert a = driver.switchTo().alert();
	            Thread.sleep(500);

	            System.out.println(a.getText());
	            Thread.sleep(500);

	            a.accept();
	            Thread.sleep(500);

	            driver.switchTo().defaultContent();
	            driver.findElement(By.id("login1")).sendKeys("venkat123");
	            driver.quit();
	    }

	}


