package com.test.extractData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException 
	 */
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		String excelPath = "D:\\Sheet.xlsx";
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = new WorkbookFactory().create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		
		Cell cel = row.createCell(6);
		cel.setCellType(cel.CELL_TYPE_STRING);
		cel.setCellValue("PASS");
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		
			}

}
