package com.Orange.Generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getCellValue(String FILEPATH,String sheet,int row,int column) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(FILEPATH);
		
		Workbook wb=WorkbookFactory.create(fis);
		String cvalue=wb.getSheet(sheet).getRow(row).getCell(column).toString();
		return cvalue;
		
	}
	public static int getLastRow(String FILEPATH,String sheet) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(FILEPATH);
		
		Workbook wb=WorkbookFactory.create(fis);
		int lastrow=wb.getSheet(sheet).getLastRowNum();
		return lastrow;
		
	}
}
