package classwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Week2day1secondpro {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();


		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElementById("demo").getText());
	     
		

	}

}
