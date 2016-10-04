

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class frame
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		


// Chrome
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();

				// Maximize
				driver.manage().window().maximize();

				// Set timeouts
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// Enter URL - 
				driver.get("http://jqueryui.com/draggable/");

				//Switch into frame
				driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
				
//				Print the text in the draggable element
				System.out.println(driver.findElement(By.id("draggable")).getText());
				
				// Switch out of frame
				driver.switchTo().defaultContent();
				
				//clicking on Droppable link
				driver.findElement(By.linkText("Droppable")).click();
				
			}
















		

	}


