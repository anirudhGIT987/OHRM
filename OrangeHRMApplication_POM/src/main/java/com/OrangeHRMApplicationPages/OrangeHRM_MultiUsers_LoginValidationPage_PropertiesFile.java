package com.OrangeHRMApplicationPages;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class OrangeHRM_MultiUsers_LoginValidationPage_PropertiesFile extends BaseTest{
	Properties prop;
	FileInputStream orangeHrmPropertiesfile;
	
	public OrangeHRM_MultiUsers_LoginValidationPage_PropertiesFile() {
		PageFactory.initElements(driver, this);
		
	orangeHrmPropertiesfile = new FileInputStream("./src/main/java/com/Config/OrangeHRM.properties");
			prop.load(orangeHrmPropertiesfile);
	}	
	
	
	//		By loginPanelProperty=By.id(prop.getProperty("orangeHRMApplicationLogInPage_loginPanel_idProperty"));

	@FindBy(id =prop.getProperty("orangeHRMApplicationLogInPage_loginPanel_idProperty"))
	WebElement loginPanelText;
	
	
	
	
}
