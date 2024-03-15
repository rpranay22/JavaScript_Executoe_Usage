package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterVerification {
	// Instance of WebDriver    
	   WebDriver driver;
	RegisterVerification(WebDriver driver){
		this.driver=driver;
	}
	
	// Locator
	By msg_success_loc=By.xpath("//*[@id=\"registration-form\"]/p");
	 public String verifyRegister() {
		 String msg=driver.findElement(msg_success_loc).getText();
		 if(msg.equalsIgnoreCase("User registration successful.")) {
			 return "Test Case passed";
		 }
		 else {
			 return "Test Case Failed";
		 }
	 }
}
