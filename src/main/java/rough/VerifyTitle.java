package rough;



		import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class VerifyTitle {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
				System.out.println(driver.getTitle());
				if(driver.getTitle().equals("Salesforce Developers")){
					System.out.println("Title Matches");
				}else{
					System.out.println("Title didn't match");
				}
				WebElement job =driver.findElementById("job_role");
				Select dropDown = new Select(job);
				//dropDown.selectByIndex(2);
				//dropDown.selectByVisibleText("IT Manager/Executive");
				List<WebElement> options = dropDown.getOptions();
				int count = options.size();
				dropDown.selectByIndex(count-1);
				for (WebElement option : options) {
					System.out.println(option.getText());
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}

		


	}


