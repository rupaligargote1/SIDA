package resor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelDataConfig 
{
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelDataConfig(String excelPath) throws IOException
	{
		  try 
		  {
			  
			FileInputStream fis=new FileInputStream(excelPath);
			  wb=new XSSFWorkbook(fis);
			  sheet1= wb.getSheetAt(1);
			  
		  } catch (Exception e) 
		  {
			System.out.println(e.getMessage());
			
		  }
	}
	
	public String getData(int sheetNumber,int row,int column)
	{
		
		 XSSFCell cell = sheet1.getRow(row).getCell(column);   
         //SET AS STRING TYPE
         cell.setCellType(cell.CELL_TYPE_STRING);
         String data= cell.getStringCellValue();
		//String data=sheet1.getRow(row).getCell(column).getStringCellValue();
     
		return data;
	}

}
