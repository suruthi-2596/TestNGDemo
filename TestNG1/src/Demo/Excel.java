package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
public static String  ExcelRead(int Sheet,int row,int cell) 
{
	String Location=null;
	try {
		FileInputStream fs=new FileInputStream("G:\\Selenium_Project\\TestNG1\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		//HSSFWorkbook obj = new HSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheetAt(Sheet);
		Location=sh.getRow(row).getCell(cell).getStringCellValue();}
		catch(Exception e)
		{
			System.out.println("Exception:" +e);
		}
		
		return Location;	
	
	}

}
	

/*public static String ExcelWrite(int Sheet,int Row,int cell,String val)
{
	try
	{
		FileInputStream fs=new FileInputStream("G:\\Selenium_Project\\TestNG1\\Book1.xlsx");
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet sh=wb.getSheet("Sheet2");
		sh.getRow(Row).getCell(cell).setCellValue(val);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return val;
		
	}
}*/


