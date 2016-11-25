package com.test.extractData;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFromExcel {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException 
	 */
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		String excelPath = "F:\\Test_Data.xlsx";
		String exptTitle = "actiTIME - Enter Time-Track";
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = new WorkbookFactory().create(fis);
		Sheet sh = wb.getSheet("Sheet4");
		int rowCount = sh.getLastRowNum();
		int i,j;
		for (i =1 ; i<=rowCount;i++)
		{
			
				Row row = sh.getRow(i);
				String username = row.getCell(1).getStringCellValue();
				String Password = row.getCell(2).getStringCellValue();
				System.out.println("Username:"+username+" Password : "+Password);
					
				WebDriver driver= new FirefoxDriver(); //launch the browser
				driver.get("http://sphurthi-pc/login.do");
				
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
				
				driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(Password);
				
				driver.findElement(By.xpath("//a[@id='loginButton']")).click();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				String title = driver.getTitle();
				Cell cel = row.createCell(3);
				cel.setCellType(cel.CELL_TYPE_STRING);
				if(exptTitle.equals(title))
				{
					cel.setCellValue("PASS");
					
					
				}
				else
				{
					cel.setCellValue("FAIL");
					
					
				}
				
				
				FileOutputStream fos = new FileOutputStream(excelPath);
				wb.write(fos);
				driver.close();
				fis.close();
				fos.close();
				
			
			
		}
		
		
		
		
		

	}

}
