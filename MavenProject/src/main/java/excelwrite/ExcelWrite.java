package excelwrite;
import org.apache.poi.ss.usermodel.*;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) {
		
		        try (XSSFWorkbook workbook = new XSSFWorkbook()) {
		            XSSFSheet sheet = workbook.createSheet("Sheet1");

		            // Write some data to the Excel file
		            Row row1 =  sheet.createRow(0);
		            row1.createCell(0).setCellValue("Name");
		            row1.createCell(1).setCellValue("Age");

		            
		            Row row2 = sheet.createRow(1);
		            row2.createCell(0).setCellValue("Alice");
		            row2.createCell(1).setCellValue(30);

		            
		            Row row3 = sheet.createRow(2);
		            row3.createCell(0).setCellValue("Bob");
		            row3.createCell(1).setCellValue(25);
		            
		            Row row4=sheet.createRow(3);
		            row4.createCell(0).setCellValue("Diya");
		            row4.createCell(1).setCellValue(28);

		            
		            // Write the Excel file to disk
		            try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\SREEKUTTY K V\\Desktop\\Data.xlsx")) 
		            {
		                workbook.write(fileOut);
		            }

		            System.out.println("Excel file has been created successfully!");

		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		

	}


