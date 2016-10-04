package classwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class Homework {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/button").click();
		Thread.sleep(5000);	
		System.out.println(driver.switchTo().alert().getText());
		Alert alert=driver.switchTo().alert();
		
		driver.switchTo().alert().sendKeys("sithara");
		Thread.sleep(5000);	
		
		
		System.out.println(alert.getText());
		alert.accept();
		driver.findElementByXPath("/html/body/button").click();
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElementById("demo").getText());
	
		
		
		
	}
	

}
