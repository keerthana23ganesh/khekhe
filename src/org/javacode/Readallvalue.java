package org.javacode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readallvalue {
	public static void main(String[] args) throws IOException  {
		File file=new File("C:\\Users\\user\\eclipse-workspace\\Frameworks_MvnProject1\\Excel sheet\\keerthana.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet = workbook.getSheet("pract");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			System.out.println(row);		
		for (int i1 = 0; i1 < row.getPhysicalNumberOfCells();i1++) {
			Cell cell = row.getCell(i1);
			CellType cellType = cell.getCellType();
			System.out.println(cellType);
			switch(cellType) {
			case STRING:
				String value = cell.getStringCellValue();
				System.out.println(value);
			break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					
				}
				
		}
		}
	

}}}
