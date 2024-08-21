package _S_01_IT_ST;

import org.openqa.selenium.WebDriver;
import java.io.IOException;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.After;

public class IT_ST_22_DesiredCapabilities_BrowserCheck_Bringed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exee");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in");*/
		/*System.setProperty("webdriver.ie.driver", "C:\WebDriver\IEDriver\IEDriverServer.exe");*/
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		
		
		FirefoxOptions browserOptions = new FirefoxOptions();
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		browserOptions.setCapability("marionette",true);
		FirefoxDriver firefoxDriver = new FirefoxDriver(browserOptions); 
		}

}
		
//		public WebDriver driver;
//		@Before
//		public void startBrowser() {
//			System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
//			FirefoxOptions browserOptions = new FirefoxOptions();
//		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//			browserOptions.setCapability("marionette", true);
//		driver = new FirefoxDriver(browserOptions);
//		
//		}
//
//		@Test
//		public void navigateToUrl() {
//		driver.get("https://www.browserstack.com");
//		}
//
//		@After
//		public void endTest() {
//		driver.quit();
//		}
//	
//		}
