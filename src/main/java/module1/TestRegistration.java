package module1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class TestRegistration {
	// Creating instance of WebDriver
		WebDriver driver;
	// Creating instance of JavaScriptExecutor
		JavascriptExecutor jse;
	// Locators
		Object text_name_loc;
		Object text_address_loc;
		Object btn_radio_male_loc;
		Object btn_radio_female_loc;
		Object btn_chckbox_travelling_loc;
		Object btn_chckbox_reading_loc;
		Object btn_chckbox_music_loc;
		Object dropdown_country_loc;
		Object dropdown_city_loc;
		Object calender_dob_loc;	
	// Constructor
		TestRegistration(WebDriver driver,JavascriptExecutor jse){
			this.driver=driver;
			this.jse=jse;
			text_name_loc=jse.executeScript("return document.getElementById('name')");			
			text_address_loc=jse.executeScript("return document.getElementById('address')");		
			btn_radio_male_loc=jse.executeScript("return document.getElementById('male')");
			btn_radio_female_loc=jse.executeScript("return document.getElementById('female')");
			btn_chckbox_travelling_loc=jse.executeScript("return document.getElementById('traveling')");
			btn_chckbox_reading_loc=jse.executeScript("return document.getElementById('reading')");
			btn_chckbox_music_loc=jse.executeScript("return document.getElementById('music')");
			dropdown_country_loc=jse.executeScript("return document.getElementById('country')");
			dropdown_city_loc=jse.executeScript("return document.getElementById('city')");
			calender_dob_loc=jse.executeScript("return document.getElementById('dob')");
		}
	// Locators			
		By btn_register_loc=By.xpath("//*[@id='registration-form']/button");
		
		public void setName(String name)  {
			     
		        ((WebElement)text_name_loc).sendKeys(name);
		}
		public void setCity(String city) {
			((WebElement)text_address_loc).sendKeys(city);
		}
		public void setGender(String gender) {
			if(gender.equalsIgnoreCase("MALE")) {
				((WebElement)btn_radio_male_loc).click();
			}
			else {
				((WebElement)btn_radio_female_loc).click();
			}
		}
		public void setHobbies(String... hobbies) {
			for(int i=0;i<hobbies.length;i++) {
				if(hobbies[i].equalsIgnoreCase("reading")) {
					((WebElement)btn_chckbox_reading_loc).click();
				}
				else if(hobbies[i].equalsIgnoreCase("travelling")) {
					((WebElement)btn_chckbox_travelling_loc).click();
				}
				else if(hobbies[i].equalsIgnoreCase("music")) {
					((WebElement)btn_chckbox_music_loc).click();
				}
			}
		}
		public void setCountry(String country) {
			 new Select(((WebElement)dropdown_country_loc)).selectByVisibleText(country);
		}
		public void setCityCountry(String city) {
		     new Select(((WebElement)dropdown_city_loc)).selectByVisibleText(city);
			
		}
		public void setDob(String dob) {
			((WebElement)calender_dob_loc).sendKeys(dob);
		}
		public void clickRegBtn() {
			driver.findElement(btn_register_loc).click();     	
		}
}

