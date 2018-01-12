package com.framework.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelutilities
{

	static final String filepath=".\\Testdata\\Testdata.xls";
	public static String readData(String Sheetname, int rowNum,int cellNum)
	{
		String value=null;
		try
		{
			Workbook	wb = WorkbookFactory.create(new FileInputStream(new File(filepath)));	
			value=wb.getSheet(Sheetname).getRow(rowNum).getCell(cellNum).getStringCellValue();
		}
		catch (EncryptedDocumentException e)
		{
			e.printStackTrace();
		}
		catch (InvalidFormatException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
		
		
	}
	
}
