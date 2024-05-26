package actionmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{
	
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.Edge.driver", "driver//Edgedriver.exe");
        WebDriver driver = new org.openqa.selenium.edge.EdgeDriver(); // open the browser

        driver.manage().window().maximize(); // maximize the windows
        driver.get("https://demoqa.com/buttons"); // corrected URL
        
        WebElement ele = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        Thread.sleep(100); // slight delay before performing action
        
        Actions act = new Actions(driver);
        act.contextClick(ele).build().perform(); // perform double click action
        act.contextClick(ele).perform();
        System.out.println("hi");
        
        // Clean up
        driver.quit(); // close the browser
    }

	
}
