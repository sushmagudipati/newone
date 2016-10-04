package week1.hw1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
public class Irctcweek1hw1 {

	private static final String WebElement = null;
	private static WebElement options1;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement train = driver.findElementById("userRegistrationForm:userName");
		driver.findElementById("userRegistrationForm:userName").sendKeys("siva");
		WebElement train1 = driver.findElementById("userRegistrationForm:password");
		driver.findElementById("userRegistrationForm:password").sendKeys("siva123");
		WebElement train2 = driver.findElementById("userRegistrationForm:confpasword");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("siva123");
		WebElement train3 = driver.findElementById("userRegistrationForm:securityQ");
		Select dropDown = new Select(train3);
		List<WebElement> options = dropDown.getOptions();
		int count= options.size();
		dropDown.selectByIndex(count-8);
		WebElement train4= driver.findElementById("userRegistrationForm:securityAnswer");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("sunny");
		WebElement train5 = driver.findElementById("userRegistrationForm:prelan");
		Select dropDown1 = new Select(train5);
		List<WebElement> options1 = dropDown1.getOptions();
		int count1= options1.size();
		dropDown1.selectByIndex(count1-1);
		WebElement train6 = driver.findElementById("userRegistrationForm:firstName");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("siva");
		WebElement train7 = driver.findElementById("userRegistrationForm:middleName");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("ram");
		WebElement train8 = driver.findElementById("userRegistrationForm:lastName");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("v");
		WebElement train9 = driver.findElementById("userRegistrationForm:gender");
		WebElement radioBtn=driver.findElementById("userRegistrationForm:gender:0");
		radioBtn.click();
		WebElement train10 = driver.findElementById("userRegistrationForm:maritalStatus");
		WebElement radioBtn1=driver.findElementById("userRegistrationForm:maritalStatus:0");
		radioBtn1.click();
		WebElement train11 = driver.findElementById("userRegistrationForm:dobDay");
		Select dropDown2 = new Select(train11);
		List<WebElement> options2 = dropDown2.getOptions();
		int count2= options2.size();
		dropDown2.selectByIndex(count -4);
		WebElement train12=driver.findElementById("userRegistrationForm:dobMonth");
		Select dropDown3 =new Select(train12);
		List<WebElement>options3=dropDown3.getOptions();
		int count3=options3.size();
		dropDown3.selectByIndex(count -5);
		WebElement train13=driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dropDown4=new Select(train13);
		List<WebElement>options4=dropDown4.getOptions();
		int count4=options4.size();
		dropDown4.selectByIndex(count -4);
		WebElement train14=driver.findElementById("userRegistrationForm:occupation");
		Select dropDown5=new Select(train14);
		List<WebElement>options5=dropDown5.getOptions();
		int count5=options5.size();
		dropDown5.selectByIndex(count -3);
		WebElement train15 = driver.findElementById("userRegistrationForm:uidno");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456");
		WebElement train16= driver.findElementById("userRegistrationForm:idno");
		driver.findElementById("userRegistrationForm:idno").sendKeys("654321");
		WebElement train17 = driver.findElementById("userRegistrationForm:email");
		driver.findElementById("userRegistrationForm:email").sendKeys("sushma@gmail.com");
		WebElement train18 = driver.findElementById("userRegistrationForm:mobile");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("0987654321");
		WebElement train19=driver.findElementById("userRegistrationForm:nationalityId");
		Select dropDown6=new Select(train19);
		List<WebElement>options6=dropDown6.getOptions();
		int count6=options6.size();
		dropDown6.selectByIndex(count -7);
		WebElement train20 = driver.findElementById("userRegistrationForm:address");
		driver.findElementById("userRegistrationForm:address").sendKeys("house no:14");
		WebElement train21 = driver.findElementById("userRegistrationForm:street");
		driver.findElementById("userRegistrationForm:street").sendKeys("sai street");
		WebElement train22= driver.findElementById("userRegistrationForm:area");
		driver.findElementById("userRegistrationForm:area").sendKeys("polacherry");
		WebElement train23 = driver.findElementById("userRegistrationForm:countries");
		Select dropDown7=new Select(train23);
		List<WebElement>options7=dropDown6.getOptions();
		int count7=options7.size();
		dropDown7.selectByIndex(count -8);
		WebElement train24= driver.findElementById("userRegistrationForm:pincode");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600048");
		WebElement train25=driver.findElementById("userRegistrationForm:cityName");
		Select dropDown8=new Select(train19);
		List<WebElement>options8=dropDown8.getOptions();
		int count8=options8.size();
		dropDown8.selectByIndex(count -1);
		WebElement train26=driver.findElementById("userRegistrationForm:postofficeName");
		Select dropDown9=new Select(train19);
		List<WebElement>options9=dropDown9.getOptions();
		int count9=options9.size();
		dropDown9.selectByIndex(count +1);
		WebElement train27 = driver.findElementById("userRegistrationForm:landline");
		driver.findElementById("userRegistrationForm:landline").sendKeys("08592345678");
		
		
		
		
		
		
		
		
		
		
		

	}

	
		
	}

	
	


