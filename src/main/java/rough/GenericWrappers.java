package rough;
package rough;

	import java.io.File;
	import java.io.IOException;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.NoAlertPresentException;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.NoSuchWindowException;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.net.UrlChecker.TimeoutException;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.thoughtworks.selenium.webdriven.commands.AlertOverride;

	public class GenericWrappers implements Wrappers {
		// Declare Driver Class
		RemoteWebDriver driver;
		int i = 1;

		@Override
		public void invokeApp(String browser, String Url) {

			try {
				if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase("internet explorer")) {
					System.setProperty("webdriver.internetExplorer.driver", "./drivers/IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				} else {
					driver = new FirefoxDriver();
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get(Url);
				System.out.println("The application is launched");
			} catch (WebDriverException e) {
				System.out.println("Unfortunately the browser is lost"+browser);
			} finally {

				takeSnap();
			}

		}

		@Override
		public void enterById(String idValue, String data) {
			try {
				driver.findElementById(idValue).clear();
				driver.findElementById(idValue).sendKeys(data);
				System.out.println("The value is entered");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.out.println("The element:" + idValue + "with value" + data);
			} catch (WebDriverException e) {
				System.out.println("Unfortunately the browser is lost");
			} finally {
				takeSnap();
			}

		}

		@Override
		public void enterByName(String nameValue, String data) {
			try {
				driver.findElementByName(nameValue).clear();
				driver.findElementByName(nameValue).sendKeys(data);
				System.out.println("The value is entered");
			} catch (NoSuchElementException e) {
				System.out.println("The element:" + nameValue + "with value" + data);
			} catch (WebDriverException e) {
				System.out.println("Unfortunately the browser is lost");
			} finally {
				takeSnap();
			}

		}

		@Override
		public void enterByXpath(String xpathValue, String data) {
			try {
				driver.findElementByXPath(xpathValue).clear();
				driver.findElementByXPath(xpathValue).sendKeys(data);
				System.out.println("The value is entered");
			} catch (NoSuchElementException e) {
				System.out.println("The element:" + xpathValue + "with value" + data);
			} catch (WebDriverException e) {
				System.out.println("Unfortunately the browser is lost");
			} finally {
				takeSnap();
			}

		}

		@Override
		public void verifyTitle(String title) {
			try {
				String currentTitle = driver.getTitle();
				if (currentTitle.equals(title)) {
					System.out.println("title matches" + currentTitle);

				} else
					System.out.println("title doesnt matches" + currentTitle);
			} catch (NoSuchElementException e) {
				System.out.println("The element with value" + title);
			} catch (WebDriverException e) {
				System.out.println("unfortunately window is closed");
			} finally {

				takeSnap();
			}

		}

		@Override
		public void verifyTextById(String id, String text) {
			try {
				String actualText = driver.findElementById(id).getText();
				if (actualText.equals(text)) {
					System.out.println("The verification is Success");
				} else {
					System.out.println("The verification is fail");
				}
			} catch (NoSuchElementException e) {
				System.out.println("The element:" + id + "with value" + text);

			} catch (WebDriverException e) {
				System.out.println("unfortunately window is closed");
			} finally {

				takeSnap();
			}
		}

		@Override
		public void verifyTextByXpath(String xpath, String text) {
			try {
				String actualText = driver.findElementByXPath(xpath).getText();
				if (actualText.equals(text)) {
					System.out.println("The verification is Success");
				} else {
					System.out.println("The verification is fail");
				}
			} catch (NoSuchElementException e) {
				System.out.println("The element:" + xpath + "with value" + text);
			} catch (WebDriverException e) {
				System.out.println("unfortunately window is closed");
			} finally {

				takeSnap();
			}
		}

		@Override
		public void verifyTextContainsByXpath(String xpath, String text) {
			try {
				String actualText = driver.findElementByXPath(xpath).getText();
				if (actualText.contains(text)) {
					System.out.println("The verification is Success");
				} else {
					System.out.println("The verification is fail");
				}
			} catch (NoSuchElementException e) {
				System.out.println("The element:" + xpath + "with value" + text);
			} catch (WebDriverException e) {
				System.out.println("unfortunately window is closed");
			} finally {
				takeSnap();
			}

		}

		@Override
		public void verifyTextContainsById(String id, String text) {
			try {
				String actualText = driver.findElementById(id).getText();
				if (actualText.contains(id)) {
					System.out.println("The verification is Success");
				} else {
					System.out.println("The verification is fail");
				}
			} catch (NoSuchElementException e) {
				System.out.println("The element:" + id + "with value" + text);
			} catch (WebDriverException e) {
				System.out.println("unfortunately window is closed");
			} finally {

				takeSnap();
			}
		}

		@Override
		public void clickById(String id) {
			try {
				try{
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
				}
				catch (org.openqa.selenium.TimeoutException e) {
					System.out.println("exception caused by wait is handled");
				}
				driver.findElementById(id).click();
				System.out.println(" Click is successful");
			} catch (NoSuchElementException e) {
				System.out.println("The element with value" +id);
			} catch (WebDriverException e) {
				System.out.println("unfortnately window is closed");
			} finally {

				takeSnap();
			}
		}

		@Override
		public void clickByClassName(String classVal) {
			try {
				try {
					WebDriverWait wait = new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.elementToBeClickable(By.className(classVal)));
				} catch (org.openqa.selenium.TimeoutException e) {
					System.out.println("exception caused by wait is handled");
				}
				driver.findElementByClassName(classVal).click();
				System.out.println(" Click is successful");
			} catch (NoSuchElementException e) {
				System.out.println("The element:with value" + classVal);
			}
			catch (WebDriverException e) {
				System.out.println("unfortnately window is closed");
			}

			finally {

				takeSnap();
			}
		}

		@Override
		public void clickByName(String name) {
			try {
				try {
					WebDriverWait wait = new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.elementToBeClickable(By.className(name)));
				} catch (org.openqa.selenium.TimeoutException e) {
					System.out.println("exception caused by wait is handled");
				}
				driver.findElementByName(name).click();
				System.out.println(" Click is successful");
			} catch (NoSuchElementException e) {
				System.out.println("The element:with value" + name);
			} catch (WebDriverException e) {
				System.out.println("unfortunately window closed");
			} finally {
				takeSnap();
			}

		}

		@Override
		public void clickByLink(String name) {
			try {
				try {
					WebDriverWait wait = new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.elementToBeClickable(By.className(name)));
				} catch (org.openqa.selenium.TimeoutException e) {
					System.out.println("exception caused by wait is handled");
				}
				driver.findElementByLinkText(name).click();
				System.out.println(" Click is successful");
			} catch (NoSuchElementException e) {
				System.out.println("The element:with value" + name);
			} catch (WebDriverException e) {
				System.out.println("unfortunately window is closed");
			} finally {
				takeSnap();
			}
		}

		@Override
		public void clickByXpath(String xpathVal) {
			try {
				try {
					WebDriverWait wait = new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.elementToBeClickable(By.className(xpathVal)));
				} catch (org.openqa.selenium.TimeoutException e) {
					System.out.println("exception caused by wait is handled");
				}
				driver.findElementByXPath(xpathVal).click();
				System.out.println(" Click is successful");
			} catch (NoSuchElementException e) {
				System.out.println("The element:with value" + xpathVal);
			} catch (WebDriverException e) {
				System.out.println("unfortunately window is closed");
			} finally {

				takeSnap();
			}
		}

		@Override
		public String getTextById(String idVal) {
			String idTextValue = "";
			try {
				idTextValue = driver.findElementById(idVal).getText();
				takeSnap();

			} catch (NoSuchElementException e) {
				System.out.println("id not found");
			} catch (WebDriverException e) {
				System.out.println("The element:with value" + idVal);
			}

			finally {
				takeSnap();
			}
			return idTextValue;
		}

		@Override
		public String getTextByXpath(String xpathVal) {
			String xpathTextValue = "";
			try {
				xpathTextValue = driver.findElementByXPath(xpathVal).getText();

			} catch (NoSuchElementException e) {
				System.out.println("The element:with value" + xpathVal);
			} catch (WebDriverException e) {
				System.out.println("unfortunately browser is closed");
			} finally {
				takeSnap();
			}

			return xpathTextValue;
		}

		@Override
		public void selectVisibileTextById(String id, String value) {
			try {
				WebElement drop = driver.findElementById(id);
				Select sel = new Select(drop);
				List<WebElement> listOfOptions = sel.getOptions();
				for (WebElement currentOption : listOfOptions) {
					if (currentOption.isDisplayed() && currentOption.equals(value)) {
						currentOption.click();
					}
				}
			} catch (NoSuchElementException e) {
				System.out.println("The element:" + id + "with value" + value);
			} catch (WebDriverException e) {
				System.out.println("unfortunately browser is closed");
			} finally {

				takeSnap();
			}
		}

		@Override
		public void selectIndexById(String id, String value) {
			try {
				WebElement drop = driver.findElementById(id);
				Select sel = new Select(drop);
				List<WebElement> listOfOptions = sel.getOptions();
				int index = 0;
				for (WebElement currentOption : listOfOptions) {

					if (currentOption.isDisplayed() && currentOption.equals(value)) {

						sel.selectByIndex(index);
					}
					index++;
				}
			} catch (NoSuchElementException e) {
				System.out.println("the element " + id + "is not found for " + value);
			} catch (WebDriverException e) {
				System.out.println("unfortunately browser is closed");
			} finally {

				takeSnap();
			}

		}

		@Override
		public void switchToParentWindow() {

			try {
				Set<String> allwin = driver.getWindowHandles();
				for (String eachwin : allwin) {
					driver.switchTo().window(eachwin);
					break;
				}
			} catch (NoSuchWindowException e) {
				System.out.println("no such window is found");
			} catch (Exception e) {
				System.out.println("unfortunately browser is closed");
			} finally {

				takeSnap();
			}
		}

		@Override
		public void switchToLastWindow() {
			try {
				Set<String> allwin = driver.getWindowHandles();
				for (String eachwin : allwin) {
					driver.switchTo().window(eachwin);
				}
			} catch (NoSuchWindowException e) {
				System.out.println("no such window is found");
			} catch (WebDriverException e) {
				System.out.println("unfortunately browser is closed");
			} finally {

				takeSnap();
			}
		}

		@Override
		public void acceptAlert() {
			try {
				driver.switchTo().alert().accept();
			} catch (NoAlertPresentException e) {
				System.out.println("alert is not present");
			} catch (WebDriverException e) {
				System.out.println("unfortunately browser is lost");
			}
		}

		@Override
		public void takeSnap() {
			File src = driver.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(src, new File("./snaps/snap" + i + ".jpeg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			i++;
		}

		@Override
		public void quitBrowser() {

			try {
				driver.quit();
				System.out.println("All browsers closed");
			} catch (WebDriverException e) {
				System.out.println("unfortunately browser is closed");
			}
		}


	public void clickByXpathWithoutSnapshot(String xpathVal) {
		try {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.elementToBeClickable(By.className(xpathVal)));
			} catch (org.openqa.selenium.TimeoutException e) {
				System.out.println("exception caused by wait is handled");
			}
			driver.findElementByXPath(xpathVal).click();
			System.out.println(" Click is successful");
		} catch (NoSuchElementException e) {
			System.out.println("The element:with value" + xpathVal);
		} catch (WebDriverException e) {
			System.out.println("unfortunately window is closed");
		}}
	}
}
