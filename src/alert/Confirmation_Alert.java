package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Alert {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        
        // Initialize a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Define the URL to navigate to
        String url = "https://demoqa.com/alerts";
        
        // Navigate to the specified URL
        driver.get(url);
        
        // Locate and click the button to trigger the confirmation alert
        driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
        
        // Switch to the alert
        Alert a = driver.switchTo().alert();
        
        // Print the text of the alert
        System.out.println(a.getText());
        
        // Wait for half a second
        Thread.sleep(500);
        
        // Dismiss the alert
        a.dismiss();
        
        // Wait for another half a second
        Thread.sleep(500);

        // Optionally, quit the driver
        // driver.quit();
    }
}
