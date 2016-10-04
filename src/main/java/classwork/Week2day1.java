package classwork;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2day1 {

	public static void main(String[] args) throws InterruptedException, IOException
	
	{
	
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.google.co.in/");
		   driver.manage().window().maximize();
		   driver.findElementById("lst-ib").sendKeys("sushma");
		   driver.findElementByClassName("sbico").click();
		   Thread.sleep(5000);
		   List<WebElement> list =driver.findElementsByPartialLinkText("sushma");
		   System.out.println(list.size());
		   for (WebElement list1 : list) {
			   list1.getAttribute("href");
			   System.out.println(list1.isDisplayed());
			   System.out.println(list1.getLocation().getX());
			   System.out.println(list1.getSize().getWidth());

					}
		   list.get(4).click();
		   File src =driver.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src, new File("./snaps/snap.jpeg"));
		   
	}
	
}
