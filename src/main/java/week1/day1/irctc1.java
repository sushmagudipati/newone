package week1.day1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class irctc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement train = driver.findElementById("userRegistrationForm:securityQ");
		Select dropDown = new Select(train);
		List<WebElement> options = dropDown.getOptions();
		for (WebElement options1: options) {
			
			System.out.println(options1.getText());
			if(options1.getText().startsWith("Who")){
				options1.click();
				break;
			}
			
			
			
		}
		
		
	}

}
