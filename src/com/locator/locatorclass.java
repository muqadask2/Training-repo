package com.locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locatorclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.get("https://www.dominos.com");
		// Find the "Order Online" button using its XPath
        WebElement orderOnlineButton = driver.findElement(By.xpath("//a[contains(text(),'Order Online')]"));

        // Click the "Order Online" button
        orderOnlineButton.click();

        // Wait for the page to load (simple sleep, consider using WebDriverWait in production)
        Thread.sleep(3000);

        // Find the "Delivery" button or link using its corrected XPath
        WebElement deliveryButton = driver.findElement(By.xpath("//button[@id='tab-Delivery' and @role='tab' and contains(@class, 'css-1u290wa') and @data-quid='Delivery-input']"));

        // Click the "Delivery" button
        deliveryButton.click();
        
       
//     // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement deliveryButton1 = driver.findElement(By.xpath("//button[@id='tab-Delivery']"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='tab-Delivery']")));
        deliveryButton1.click();
        
        // Wait for the page to load (simple sleep, consider using WebDriverWait in production)
        Thread.sleep(3000);
        
        WebElement addressInput = driver.findElement(By.xpath("//input[@id='Street']"));
        // Wait for the address input fields to become visible
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Street']")));
        
        // Enter the address details
        addressInput.sendKeys("123 Main Street");

        //
        driver.close();
		
	}				
}
