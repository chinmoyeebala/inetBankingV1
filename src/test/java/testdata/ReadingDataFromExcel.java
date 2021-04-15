package testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fs=new FileInputStream("D:\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		//XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFSheet sheet=workbook.getSheetAt(0);//sheet1 index is 0
		int rowcount=sheet.getLastRowNum();//returns the row count
		int colcount=sheet.getRow(0).getLastCellNum();//returns column or cell number
		for(int i=0;i<rowcount;i++)
		{
		XSSFRow currentrow=sheet.getRow(i);// focused on current row
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();
				System.out.print("  "+value);
			}
			System.out.println();
	}

	}
}
