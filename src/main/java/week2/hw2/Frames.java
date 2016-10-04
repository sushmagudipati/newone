package week2.hw2;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {
public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
				ChromeDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");       
					 
				driver.manage().window().maximize();
				List<WebElement> outframe = driver.findElementsByTagName("iframe");
				int x=outframe.size();
				//System.out.println(x);
				int y=0;
				for (WebElement subframe : outframe) 
				{
					int z=0;
					driver.switchTo().frame(subframe);
					
						
					
					//System.out.println("Moved in to First frame:" +subframe);
					List<WebElement>inframe = driver.findElementsByTagName("iframe");
					
					
					z=inframe.size();			
					y= y+z;
					driver.switchTo().defaultContent();
					//System.out.println("Moved back to the default frame!");
					
				}
				System.out.println("The total number of Frames in the page:"+ (x+y));
				driver.quit();

			}

		

			
			
			
		
	}
