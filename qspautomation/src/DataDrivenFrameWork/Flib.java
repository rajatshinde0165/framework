package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib  {
	 
	public String readExcelData( String Excelpath,String Sheetname,int rowcout,int cellcout) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(Excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(Sheetname);
	Row row = sh.getRow(rowcout);
	Cell cell = row.getCell(cellcout);
	String data = cell.getStringCellValue();
	return data;
	}
	
	public int getRowCount(String excelpath,String Sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheetname);
		int row = sh.getLastRowNum();
		return row;
		
	}
	public String writeExcelData(String excelpath,String sheetname,int rownum,int cellnum,String Data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(Data);
	FileOutputStream fos = new FileOutputStream(excelpath);
	wb.write(fos);
	return Data;
	}
	
		
		
	
	

}
