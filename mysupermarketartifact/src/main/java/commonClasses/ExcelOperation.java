package commonClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;


public class ExcelOperation 
{
	static Workbook w1;static File f1;

	public static String readData(String sheetName,int romNum,int cellNum) throws Exception
	{
		f1 = new File("./src/test/resources/DataExcel/practice.xlsx");
		FileInputStream fis = new FileInputStream(f1);
		w1 = new Workbook(fis);
		w1.getSheet(sheetName).getRow(romNum).getCell(cellNum).getStringCellValue();
	}
	
	public void writeData(String sheetName,int romNum,int cellNum)
	{
		f1 = new File("./src/test/resources/DataExcel/practice.xlsx");
		FileOutputStream fos = new FileOutputStream(f1);
		w1 = new Workbook(fos);
		w1.getSheet(sheetName).getRow(romNum).setCell(cellNum).setStringCellValue();
		w1.write(fos);
	}
}
