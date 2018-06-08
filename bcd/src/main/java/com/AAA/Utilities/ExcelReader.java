package com.AAA.Utilities;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.AAA.base.TestBase;

public class ExcelReader extends TestBase{

	public void Excelread() throws IOException
{

	System.out.println("1");
	fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//ExcelReader//Myexcel.xlsx");
        
	System.out.println("2");
	
		XSSFWorkbook WB=new XSSFWorkbook(fis);
		XSSFSheet sheet=WB.getSheet("Sheet1");
		System.out.println("Sheet name selected is "+sheet.getSheetName());
		System.out.println("Sheet name selected is "+sheet.getLastRowNum());
		System.out.println(sheet.getRow(2).getCell(1));
	
}
	
}
