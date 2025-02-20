package Excelread_pkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Class1 {
	
	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;

	public static String getStringData(int a,int b) throws IOException
	{
		//a-cell value
		//b-row value
		f=new FileInputStream("C:\\project\\Excelread_marks.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");//to get details from sheet
		XSSFRow r =sh.getRow(a);//to get row
		XSSFCell c = r.getCell(b);//to get cell value
		return c.getStringCellValue();//return as String cell value
		
		
	
	}
	
	public static String getIntigerdata(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\project\\Excelread_marks.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r =sh.getRow(a);
		XSSFCell c=r.getCell(b);
		int x=(int)c.getNumericCellValue();
		return String.valueOf(x);
		
		
	}
	/*public static String getIntigerData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\project\\Excelread_marks.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int x=(int)c.getNumericCellValue();
		
		return String.valueOf(x);//to convert to string
	}*/
	
	

}
