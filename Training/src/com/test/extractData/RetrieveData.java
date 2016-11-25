package com.test.extractData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class RetrieveData {

	@Test
	public  void createCustomer() throws Throwable {
		
		System.out.println("create customer testcase");
		//Test Data 
		 
		//using java API's specify which external resource you are planning to in 
		FileInputStream fis = new FileInputStream("D:\\Sheet.xlsx");
		
		
		//open workbook with read mode
		//Note:All pache POI imports should be "org.apache.poi.ss.usermode"
		Workbook wb = WorkbookFactory.create(fis);
		
		//to get the control of sheet ex:sheet1
		Sheet sh = wb.getSheet("Sheet1");
		
		
		// to get the control of the first row(row and column index starts from 0 & 1]
		Row row = sh.getRow(1);
		
		
		
		String username = row.getCell(2).getStringCellValue();
		String password = row.getCell(3).getStringCellValue();
		String customername = row.getCell(4).getStringCellValue();
		
		
		System.out.println("Username =" +username);
		System.out.println("password =" +password);
		System.out.println("Username =" +customername);

	}

}
