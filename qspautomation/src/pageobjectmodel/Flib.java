package pageobjectmodel;

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
public String readexceldata(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException{
		
	
FileInputStream fis = new FileInputStream(excelpath);
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet(sheetname);

Row row = sh.getRow(rowcount);
Cell cell = row.getCell(cellcount);
String rj = cell.getStringCellValue();
return rj;

	}
public int getRowcount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetname);
	int rc = sh.getLastRowNum();
	return rc;

}
public String writDataInExcel(String excelpath,String sheetname,int rowcount,int cellcount,String Data) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetname);
	Row row = sh.getRow(cellcount);
	Cell cell = row.createCell(cellcount);
	cell.setCellValue(Data);
	FileOutputStream fos = new FileOutputStream(excelpath);
	wb.write(fos);
	return Data;	
}
public String readProperties(String excelpath,String key) throws IOException, InterruptedException {
	FileInputStream fis = new FileInputStream(excelpath);
	Properties prop = new Properties();
	prop.load(fis);
String data = prop.getProperty(key);
return data;
	
}
	

}
