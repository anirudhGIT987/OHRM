package com.BrowsersAutomation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Launching_And_Navigation{
	public static void main(String[] args) {
		
		// Now we are automating Google Chrome116
		// so, as like in mannual process to test webapplication, we will first look out for the browser icon
		
		/*	System.setProperty("webdriver.chrome.driver","D:\\Jaava\\Eclipse Workspace\\Selenium_with_Java\\BrowserDriver_Files\\chromedriver.exe ");
		
		// and later we will click on it to get opened.
			ChromeDriver driverChrome = new ChromeDriver();
			
			// Naviagte to Url
		String webApplicationUrlAddress="http://thehindu.com";
			driverChrome.navigate().to("webApplicationUrlAddress");
			*/
		System.setProperty("webdriver.gecko.driver", " D:\\Jaava\\Eclipse Workspace\\Selenium_with_Java\\BrowserDriver_Files\\geckodriver.exe");
		FirefoxDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("http://thehindu.com");
		
		
		
		
		
		// In mannual testing, first we find out the browser, before clicking on it.
		/*System.setProperty("webdriver.chrome.driver", "D:\\Jaava\\Eclipse Workspace\\Selenium_with_Java\\BrowserDriver_Files\\chromedriver.exe");
	
		 In order to click it, we must tell webdriver to click.
		 ClassName object = new ClassName();
			ChromeDriver driverChrome = new ChromeDriver();
		
		 Navigating to URL
			driverChrome.navigate().to("https://unep.org");
			
			driverChrome.get("https://www.browserstack.com");
			driverChrome.close();				
			
			Automate the script for edge browser
			System.setProperty("webdriver.edge.driver", "D:\\Jaava\\Eclipse Workspace\\Selenium_with_Java\\BrowserDriver_Files\\msedgedriver.exe");
			EdgeDriver driverEdge = new EdgeDriver();
			driverEdge.navigate().to("http://mittechnologyreview.com");
			driverEdge.close();
		//AUtomate firefox browser
			System.setProperty("webdriver.gecko.driver", "D:\\Jaava\\Eclipse Workspace\\Selenium_with_Java\\BrowserDriver_Files\\geckodriver.exe ");
			FirefoxDriver driverFirefox = new FirefoxDriver();
			driverFirefox. get("http://yugmacollective.org");
			
		/*System.setProperty("webdriver.edge.driver", "D:\\Jaava\\Eclipse Workspace\\Selenium_with_Java\\BrowserDriver_Files\\msedgedriver.exe");
		EdgeDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("http://atree.org");
		edgeDriver.close();
		*/

			
			
			
			
			
			
			
			
			
			
			
			
	}
}
