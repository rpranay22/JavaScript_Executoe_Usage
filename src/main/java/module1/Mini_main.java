package module1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Mini_main {
	// Creating instance of WebDriver
	static WebDriver driver;
	// Creating instance of JavaScriptExecutor
	static JavascriptExecutor jse; 
	// Main Method
	public static void main(String[] args) throws InterruptedException  {
		// Initialization of driver
		driver=new ChromeDriver();	
		jse=((JavascriptExecutor)driver);
	// Creating object for LaunchLink class
		LaunchLink laLink=new LaunchLink(driver);
		laLink.launch();		
		// Creating object for Popup class
		driver.manage().window().maximize();
		Popup pUp=new Popup(driver,jse);
		pUp.clickAlert();
		pUp.clickAccept();
		pUp.openReg();
		// Creating object for TestRegistration
		TestRegistration tReg=new TestRegistration(driver,jse);
		
		try {
		tReg.setName("pranay");
		tReg.setCity("Delhi");
		tReg.setGender("male");
		tReg.setHobbies("travelling","music");
		tReg.setCountry("India");
		tReg.setCityCountry("New York");
		tReg.setDob("07222001");
		tReg.clickRegBtn();
		// Creating object for RegisterVerification Class
		RegisterVerification reVerfy=new RegisterVerification(driver);
		String msg=reVerfy.verifyRegister();
		System.out.println(msg);}
		catch(NoSuchElementException e) {
			System.out.println("please enter valid details");
			System.out.println("Test Case Failed");
		}	
	}

}
