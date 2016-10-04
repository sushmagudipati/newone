package week2.hw2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Roughframe {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	           
	       driver.manage().window().maximize();
		  
		  driver.get("http://layout.jquery-dev.com/demos/iframes_many.html"); 
						
		driver.switchTo().frame(driver.findElementByClassName("ui-layout-center"));
		
		System.out.println(driver.findElement(By.id("faviconlink")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Dogpile Web Search")).click();
		
		
		
	}

}
