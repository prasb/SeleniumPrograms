package com.test.extractData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * A dirty simple program that reads an Excel file.
 * 
 * @author www.codejava.net
 * 
 */
public class SimpleExcelReaderExample {

	static HashMap<Integer, String> hm = new HashMap<Integer, String>();
	static int i = 0, j = 0;

	public static void createHashMap() {

		hm.put(1, "NetAct162");
		hm.put(2, "NetAct16");
		hm.put(3, "NetAct155MP1");
		hm.put(4, "NetAct155");
		hm.put(5, "NetAct152");
		hm.put(6, "Netact15");
		hm.put(7, "NetAct15_PT1");
		hm.put(8, "NetAct8MP53");
		hm.put(9, "NetAct8MP52");
		hm.put(10, "NetAct8MP51");
		hm.put(11, "NetAct8MP5");
		hm.put(12, "NetAct8MP4");
		hm.put(13, "NetAct8MP3");
		hm.put(14, "NetAct8MP2");
		hm.put(15, "NetAct8MP1");
		hm.put(16, "NetAct8EP1");
		hm.put(17, "NetAct8");

	}

	public static void main(String[] args) throws IOException {

		PrintWriter writer = new PrintWriter("D://Installation_output.txt",
				"UTF-8");

		PrintStream out = new PrintStream(
				new FileOutputStream("D://output.txt"));

		createHashMap();

		String excelFilePath = "D:\\Installation paths taken by customers.xlsx";
		FileInputStream inputStream = new FileInputStream(new File(
				excelFilePath));

		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = firstSheet.iterator();

		while (iterator.hasNext()) {
			ArrayList<String> arrlist = new ArrayList<String>();

			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			i++;
			j = 0;
			while (cellIterator.hasNext()) {

				Cell cell = cellIterator.next();

				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:

					// System.out.print(cell.getStringCellValue());
					String clientname = cell.getStringCellValue();
					String client = clientname + "   => ";
					System.out
							.print("********************************************************************\n");
					writer.print("********************************************************************\n");

					arrlist.add(client);

					break;

				case Cell.CELL_TYPE_BOOLEAN:

					break;

				case Cell.CELL_TYPE_NUMERIC:

					double t1 = cell.getNumericCellValue();

					int value = (int) t1;
					if (value > 101) {
						String installation_id = "" + value;
						arrlist.add("      " + installation_id + " => ");
					}

					if (j > 0) {
						String release = hm.get(j) + "  ";
						arrlist.add(release);
					}

					break;

				}
				j++;

			}

			writer.print(arrlist);
			System.out.print(arrlist);
			arrlist = null;
			writer.println();
			System.out.println();
			

		}

		inputStream.close();
		writer.close();
		System.out.println("The Data processed Successfully..!!!!");
	}

}