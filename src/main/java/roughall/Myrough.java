package roughall;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;



public class Myrough {

	
	
			public static void main(String[] args) throws InterruptedException {
				// Step 1 : Launch browser (Chrome)
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				
				// Syntax for calling a class with Java (Creating an object)
				// ClassName objectName = new ClassName();
				FirefoxDriver driver = new FirefoxDriver();
				
				// Step 2 : Navigate to URL
				// Syntax for calling a method of the class using the object
				// objectName.methodName(arguments/values);
				driver.get("http://demo1.opentaps.org");
				
				// Additional browser Configs
				// Maximise the browser
				driver.manage().window().maximize();
				// For making the browser fit to full screen
				//driver.manage().window().fullscreen();
				// Set the default timeout
				
				// Step 3 : Enter Username (with proper locator)
				driver.findElementById("username1").sendKeys("DemoCSR");
				
				// Step 4 : Enter password  (with proper locator)
				driver.findElementById("password").sendKeys("crmsfa");
				// Step 5 : Click Login (with proper locator)
				driver.findElementByClassName("decorativeSubmit").click();
				//Wait for a few seconds
				Thread.sleep(5000);
				driver.findElementByLinkText("CRM/SFA").click();
				
				
				// Sample code for finding element using xpath 

				
				// Step 6 : Click logout (with proper locator)
				driver.findElementByXPath("//*[@id='logout']/input").click();
				// Step 7 : Close the browser
				driver.close();
			}

			
			
			
			
			
			
			
			
			
			
			
		


	}


