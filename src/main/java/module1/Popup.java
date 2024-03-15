package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup 
{   // Instance of WebDriver    
	   WebDriver driver;
	// Creating instance of JavaScriptExecutor
			 JavascriptExecutor jse; 
	// Locators
			 Object btn_alert_loc;
			 
	// Constructor
	   public Popup(WebDriver driver,JavascriptExecutor jse){
		  
			this.driver = driver;
			this.jse = jse;
			btn_alert_loc = jse.executeScript("return document.getElementById('btnAlert')");
			
	   }	
	   By btn_accept_loc =By.cssSelector("#ezAlerts-footer > button");
	   By nav_register_loc=By.xpath("//*[@id='navbarColor02']/ul/li[2]/a");	
	// Method to click on alert button	  
	public void clickAlert() throws InterruptedException{
		Thread.sleep(5000);
		((WebElement)btn_alert_loc).click();		
		} 
	// Method to click on accept button
	 public void clickAccept() throws InterruptedException {
		 Thread.sleep(5000);
		 driver.findElement(btn_accept_loc).click();	
	 }
	 
		public void openReg() {
			driver.findElement(nav_register_loc).click();  	
}
}
