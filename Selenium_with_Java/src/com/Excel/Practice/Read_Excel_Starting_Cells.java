package com.Excel.Practice;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Read_Excel_Starting_Cells {
	public static void main(String[] args) throws IOException {
		
		FileInputStream xcel = new FileInputStream("D:\\Jaava\\Eclipse Workspace\\Selenium_with_Java\\src\\com\\Excel\\Practice\\ExcelReadWrite.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(xcel);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();
		System.out.println("ROw Count:- "+rowCount);
		int cellCount=sheet.getRow(0).getLastCellNum();
		System.out.println("CellCount : " +cellCount);
		
		
		for(int rowindex = 0; rowindex<=rowCount;rowindex++)
		{
			Row currentRow=sheet.getRow(rowindex);
			
			for(int cindex=0;cindex<cellCount;cindex++) {
				Cell currentCell=currentRow.getCell(cindex);
					String testData=currentCell.toString();	
				System.out.print(testData+" | ");
			}
			System.out.println();
			
			
		}
		
		
		
		
		
	}
}
