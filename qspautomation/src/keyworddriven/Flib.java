package keyworddriven;

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


class Flib{
	public String readxlData(String path,String Sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String  data= cell.getStringCellValue();
		return data;
	}
	public int getrowCount(String path,String Sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheetname);
		int rc = sh.getLastRowNum();
		return rc;	
	}
	public String writeexcelData(String path,String Sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheetname);
	Row cell = sh.getRow(rowcount);
	Cell ff = cell.createCell(cellcount);
	 ff.setCellValue(data);
	  FileOutputStream fos = new FileOutputStream(path);
	  wb.write(fos);
	return data;
	
	}
	public String readProperties(String path,String key) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			String data = prop.getProperty(key);
			return data;
			
	}
	
}