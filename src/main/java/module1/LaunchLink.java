package module1;

import org.openqa.selenium.WebDriver;

public class LaunchLink {
	// Creating instance of WebDriver
	WebDriver driver;
	LaunchLink(WebDriver driver){
		
		this.driver=driver;
	}
	
	// Method to Launch the link
	public void launch() {
		
		driver.get("https://www.stqatools.com/demo/Alerts.php");
	}
}