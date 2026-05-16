package selenium20DataDrivenTestingWorkingwithMSExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		
//FileInputStream file = new FileInputStream("C:\\Users\\E026535\\eclipse-workspace\\seleniumwebdriver\\testdata\\data.xlsx");
//System.getProperty("user.dir") is a Java command that returns the current working directory of the Java Virtual Machine (JVM) as a String
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet =workbook.getSheet("Sheet1");
		//OR 
		//XSSFSheet sheet =workbook.getSheetAt(0);
		
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();//Take any row number
		
		System.out.println("number of rows:"+ totalRows);//5,Row no start from 0
		System.out.println("number of cells:"+ totalCells);//4,Cell no start from 1,But as per java it should start from 0
		//Nested for loop. Outer is rows and Inner loop is for cell or columns
		
		for (int r=0;r<=totalRows;r++)
		{
			
			XSSFRow currentRow =sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++) 
			{
				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString()+ "\t");//toString()--Converts the cell value to a string
			}
			
			System.out.println();
		}
		workbook.close();
		file.close();
		
		
	}

}
