package alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert 
{
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
        
        // Locate and click the button to trigger the prompt alert
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        
        // Switch to the alert
        Alert a = driver.switchTo().alert();
        
        // Print the text of the alert
        System.out.println(a.getText());
        
        // Send input to the alert
        a.sendKeys("yes");
        
        // Wait for a few seconds
        Thread.sleep(3000);
        
        // Dismiss the alert
        a.dismiss();
        
        // Optionally, quit the driver
        // driver.quit();
    }
}
