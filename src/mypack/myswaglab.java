mypack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Openswaglabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");
		
		driver.manage().window().maximize();
		WebElement name= driver.findElement(By.id("user-name"));
		name.sendKeys("standard_user");   //standard_user

		//name.submit();
		//Thread.sleep(1000);
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		//pass.submit();
		
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		
		 //String currentwindowHandle1 = driver.getWindowHandle();
	     //driver.switchTo().window(currentwindowHandle1);
		
		 driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		
	   // WebElement add= driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
	    //add.submit();

	    

		
	}

}