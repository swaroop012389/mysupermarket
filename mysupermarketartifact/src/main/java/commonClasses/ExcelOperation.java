package commonClasses;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;


public class ExcelOperation
{

	static XSSFWorkbook workbook;
	
	public static String readData(String sheetName,int rowNum,int cellNum) throws Exception
	{
	
			File f1 = new File(".src//test//resources//DataExcel//practice.xlsx");
			FileInputStream fis = new FileInputStream(f1);

			workbook = new XSSFWorkbook(fis);
			
			String data = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
			return data;
	
	}
	public static void writeData(String sheetName,int rowNum,int cellNum, String data) throws Exception
	{
	
		File f1 = new File(".src//test//resources//DataExcel//practice.xlsx");
		FileOutputStream fos= new FileOutputStream(f1);
			
		workbook = new XSSFWorkbook(fos);
		
		workbook.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(data);
		
		
		workbook.write(fos);
	}
}
