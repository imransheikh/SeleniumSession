package com.app.seleniumsession;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Imran Workbook, Sheet, Row, Cell (All are interfaces)
 * 		 XLS Classes
 *         HSSFWorkbook: It is a class representing the XLS file. 
 *         HSSFSheet: It is a class representing the sheet in an XLS file.
 *         HSSFRow: It is a class representing a row in the sheet of XLS file.
 *         HSSFCell: It is a class representing a cell in a row of XLS file.
 * 
 *       XLSX Classes 
 *         XSSFWorkbook: It is a class representing the XLSX file.
 *         XSSFSheet: It is a class representing the sheet in an XLSX file.
 *         XSSFRow: It is a class representing a row in the sheet of XLSX file.
 *         XSSFCell: It is a class representing a cell in a row of XLSX file.
 */
public class ReadExcelFile {

	public void readRow(int rowNumber, int columnNumber) throws IOException {
		// XSSFWorkbook workbook = null;
		Workbook workbook = null;
		try {
			// String filePath =
			// "E:\\AutomationWorkSpace\\SeleniumJava\\JavaTestProject\\Files\\CredentialSheet.xlsx";
			String filePath = System.getProperty("user.dir") + "/Files/CredentialSheet11.xls";
			FileInputStream file = new FileInputStream(filePath);

			// workbook = new XSSFWorkbook(file);
			workbook = WorkbookFactory.create(file);
			Sheet sheet = workbook.getSheetAt(0);

			// Sheet sheet = workbook.getSheet("CredentialSheet");

			Iterator<Row> rows = sheet.iterator();

			while (rows.hasNext()) {

				Row currentRow = rows.next();
				Iterator<Cell> col = currentRow.iterator();

				while (col.hasNext()) {
					//System.out.println(col.next());
					Cell cell =col.next();
					
					   switch (cell.getCellType()) {
	                    case STRING:
	                        System.out.print(cell.getStringCellValue());
	                        break;
	                    case NUMERIC:
	                        System.out.print(cell.getBooleanCellValue());
	                        break;
	                    case BOOLEAN:
	                        System.out.print(cell.getNumericCellValue());
	                        break;
	                }
	                System.out.print(" - ");
	            }
	            System.out.println();
				}
		
		} 
	
	catch (Exception e) {
			workbook.close();
		}

	}

	public static void main(String[] args) throws IOException {

		ReadExcelFile readexcel = new ReadExcelFile();
		readexcel.readRow(2, 5);
	}

}
