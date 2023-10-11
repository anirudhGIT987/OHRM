package com.BrowsersAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class OragneHRM_Login_Automation {
	public static void main(String[] args) {
	
		ChromeDriver driverChrome;
		String webApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
	System.setProperty("webdriver.chrome.driver", "D:\\Jaava\\Eclipse Workspace\\Selenium_with_Java\\BrowserDriver_Files\\chromedriver.exe");
	driverChrome = new ChromeDriver();
	driverChrome.get(webApplicationUrl);
	
	driverChrome.findElement(By.id("txtUsername")).sendKeys("AnirudhHRM");
	driverChrome.findElement(By.id("txtPassword")).sendKeys("ANIRUDHorange");
	driverChrome.findElement(By.id("btnLogin")).click();
	
	
	
}
}
