package _S_01_IT_ST;

import java.io.File;
import java.util.concurrent.ThreadFactory;
import java.io.IOException;
import org.openqa.selenium.Alert;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IT_ST_08_Switch_To_Tabs_2_Sasi_2020 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://executeautomation.com/demosite/index.html?UserName=Rajkumar&Password=coolbuddy9&Login=Login"); 
		  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(3000);
		   	      
		  //Code to open a new link from current page to new page
		    ((JavascriptExecutor)d).executeScript("window.open()");
		    ArrayList<String> tabs = new ArrayList<String>(d.getWindowHandles());
		    d.switchTo().window(tabs.get(1));
		    d.get("http://google.com");
			Thread.sleep(3000);
		    d.navigate().refresh();
		    //To stay and move to the current second window
		    ((JavascriptExecutor)d).executeScript("window.open()");
		    ArrayList<String> tabs1 = new ArrayList<String>(d.getWindowHandles());
		    d.switchTo().window(tabs1.get(2));
		    d.get("http://google.com");
			Thread.sleep(3000);
		   //To move back to the parent window
		    ArrayList<String> tab = new ArrayList<String>(d.getWindowHandles());
		    d.switchTo().window(tab.get(0));
		    d.get("https://www.amazon.in");
		    d.navigate().refresh();
		    Thread.sleep(3000); 
		    ArrayList<String> tab2 = new ArrayList<String>(d.getWindowHandles());
		    d.switchTo().window(tab2.get(2));
			Thread.sleep(3000);
			
			}

}
