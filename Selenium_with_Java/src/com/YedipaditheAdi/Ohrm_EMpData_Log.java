package com.YedipaditheAdi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utility.LogUtility;

public class Ohrm_EMpData_Log {

	public void continuition() {
// Must be in the Loop	
	By saveButtonProperty=By.Id(prop.getProperties("orangeHRMApplicationAddEmployee_SaveButton_idProperty"));
	WebElement saveButton=driver.findElement(saveButtonProperty);
	saveButton.click();
System.out.println("Clicked Save Button");

	By personalDetailsProperty=By.xPath("/html/body/div[1]/div[3]/div/div[2]/div[1]/h1");
	WebElement personalDetails=driver.findElement(personalDetailsProperty);
	String actual_PersonalDetailsPageText=personalDetails.getText();
	String expected_PersonalDetailsPageText=row1.getCell(20).getStringCellValue();
							empRowIndex.createCell(21).setCellValue(actual_PersonalDetailsPageText);
	if(actual_PersonalDetailsPageText.equalsIgnoreCase(expected_PersonalDetailsPageText))
	{
					empRowIndex.createCell(22).setCellValue("PASS");
	}
	else {
					empRowIndex.createCell(22).setCellValue("FAIL");
	}
	
	WebElement registeredFirstName=driver.findElement(By.id(properties.getProperty("orangeHRMApplicationEmployeeDetails_RegisteredFirstName_Property")));
	String actual_FirstName=registeredFirstName.getAttribute("value");
					presentRow.createCell(23).setCellValue(actual_FirstName);
	if(actual_FirstName.equals(expected_FirstName))
	{		
					presentRow.createCell(24).setCellValue("PASS");
	}
	else {
					presentRow.createCell(24).setCellValue("FAIL");
	}
	WebElement registeredMiddleName=driver.findElement(By.id(properties.getProperty("orangeHRMApplicationEmployeeDetails_RegisteredMiddleName_Property")));
	String actual_MiddleName=registeredMiddleName.getAttribute("value");
					presentRow.createCell(25).setCellValue(actual_MiddleName);
	if(actual_MiddleName.equals(expected_MiddleName))
	{
					presentRow.createCell(26).setCellValue("PASS");
	}
	else {
					presentRow.createCell(26).setCellValue("PASS");
	}
	
	WebElement registeredLastName=driver.findElement(By.id(properties.getProperty("orangeHRMApplicationEmployeeDetails_RegisteredLastName_Property")));
	String actual_LastName=registeredLastName.getAttribute("value");
					presentRow.createCell(27).setCellValue(actual_LastName);
	if(actual_LastName.equals(expected_LastName))
	{
					presentRow.createCell(28).setCellValue("PASS");
	}
	else {
					presentRow.createCell(28).setCellValue("PASS");
	}
	
	WebElement registeredEmployeeId=driver.findElement(By.id(properties.getProperty("orangeHRMApplicationEmployeeDetails_RegisteredEmployeeId_Property")));
	String actual_EmployeeId=registeredEmployeeId.getAttribute("value");
					presentRow.createCell(29).setCellValue(actual_EmployeeId);
	if(actual_EmployeeId.equals(expected_EmployeeId))
	{
					presentRow.createCell(30).setCellValue("PASS");
	}
	else {
					presentRow.createCell(30).setCellValue("PASS");
	}
	
	 addEmployeeLink=driver.findElement(By.linkText("Add Employee"));
	 addEmployeeLink.click();		
// TIll here in the Loop	
	 
	 FileOutputStream testResult = new FileOutputStream("D:\\Jaava\\Eclipse Workspace\\Selenium_with_Java\\src\\com\\Excel\\Result\\Input\\addEmployeeRegistration.xlsx");
		wb.write(testResult);
	
	 
	 
	 
	 
	 
}
	
	@Test(priority = , description ="Validation of Employee List Table into Excel")
	public void employeeListTable() {
		//FileInputStream emptyTestFile= new FileInputStream("D:\\Jaava\\Eclipse Workspace\\Selenium_with_Java\\src\\com\\Excel\\Data\\Read\\New Microsoft Excel Worksheet.xlsx");
		//XSSFWorkbook workBook = new XSSFWorkbook(emptyTestFile);
		//XSSFSheet inputDataSheet = workBook.getSheetAt(0);
		
		By employeeListProperty=By.linkText(prop.getProperty("orangeHRMApplicationEmployeeDetails_EmployeeList_linkTextProperty"));
		WebElement employeeList=driver.findElement(employeeListProperty);
		employeeList.click();
		
		for(int pageindex=0; pageindex<)
		{	
		By idHeaderProperty=By.linkText(prop.getProperty("orangeHRMApplicationEmployeeDetails_idHeaderEmployeeListTable_linkTextProperty"));
		WebElement idHeader=driver.findElement(idHeaderProperty);idHeader.click();
		
		By employeeDetailsTableProperty=By.id("orangeHRMApplicationEmployeeDetails_EmployeeListTable_idProperty");
		WebElement employeeDetailsTable=driver.findElement(employeeDetailsTable);
		
		///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[50]/td[2]
		// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[50]/td[2]
			By empTableRowProperty=By.tagName("tr");
			List<WebElement>empTableRowList=employeeDetailsTable.findElements(empTableRowProperty);
			int empTableRowCount=empTableRowList.size();
System.out.println("The No. of Active ROws in the WebTable is:- "+empTableRowCount);			
			for(int empRowindex=0; empRowindex<empTableRowCount;empRowindex++)
			{
				// Get to the Row First
					WebElement currentRow=empTableRowList.get(empRowindex);
					Row createdRow=sheet.createRow(empRowindex);
					List<WebElement>empTableCellsList=currentRow.findElements(By.tagName("td"));
					int empTableCellCount=empTableCellsList.size();
System.out.println("The No.of Active Cells in a Row is:- "+empTableCellCount);					
					for(int empCellindex=0;empCellindex<empTableCellCount;empCellindex++)
					{
						String empData=empTableCellsList.get(empCellindex).getText();
						createdRow.createCell(empCellindex).setCellValue(empData);
					}
			
			}
						By nextPageProperty=By.linkText(prop.getProperty("orangeHrm_EmployeeTable_NextPage_LinkTextProperty"));
						WebElement nextPage=driver.findElement(nextPageProperty);nextPage.click();	
						
	
	// /html/body/div[1]/div[3]/div[2]/div/form/div[1]/ul/li[5]/a
	
		}
	
		FileOutputStream outputEmpTable = new  FileOutputStream("./src/com/Excel/Result/Input/empListTableOhrm.xlsx");
		workBook.write(outputEmpTable);
	
	
	
	
		
	
	
	
	
	}
	@Test(priority = , description ="Validation of the functionality of Logout")
	public void Logout() {
		welcomeAdmin.click();
		By logOutProperty=By.linkText(prop.getProperty("orangeHRMApplicationLogInPage_LogOut_linkTextProperty"));	
		WebElement logOut=driver.findElement(logOutProperty); logOut.click();	
LogUtility.info("Logged Out of the OrangeHrm WebApplication Succesfully");		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
