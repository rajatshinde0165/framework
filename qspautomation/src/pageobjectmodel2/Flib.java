package pageobjectmodel2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readExcelData(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
		 FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
	}
	public String  writeDataInExcel(String excelpath,String sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);
		 FileOutputStream fos = new FileOutputStream(excelpath);
		 wb.write(fos);
		return data;
		 
	}
	public int  getrowcount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheetname);
		 int row = sh.getLastRowNum();
		return row;	 
	}
	public String  getProperty(String path,String key) throws IOException {
		 FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
				prop.load(fis);
		String data = prop.getProperty(key);
		return data;	
	}
	
	
	
	
	

}
