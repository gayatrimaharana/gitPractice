package org.tyss.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
 * This class contains reusable method for Excel
 * 
 */

public final class ExcelUtility {
	
	private Workbook workbook ;
	
	
	/**
	 * This method is used to initialize excel file
	 * @param excelPath
	 */
	public void initializeExcelFile(String excelPath)
	{
		FileInputStream fisExcel=null;
		try {
			fisExcel = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook = WorkbookFactory.create(fisExcel);
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	/**
	 * This method is used to fetch the data from excel
	 * @param rowNumber
	 * @param cellNumber
	 * @param SheetName
	 */
	
	public String getDataFromExcel(int rowNumber,int cellNumber,String SheetName)
	{
		 Sheet sheet = workbook.getSheet(SheetName);
		 return new DataFormatter().formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
	}
}