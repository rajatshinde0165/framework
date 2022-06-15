package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hwpf.usermodel.CharacterProperties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flidge {
	public String readData(String relativepath,String sheetname,int rowcont,int cellcount) throws EncryptedDocumentException, IOException
	{
FileInputStream fis = new FileInputStream(relativepath);
 Workbook wb = WorkbookFactory.create(fis);
  Sheet sh = wb.getSheet(sheetname);
 Row row = sh.getRow(rowcont);
 Cell cell = row.getCell(cellcount);
 String sd = cell.getStringCellValue();
return sd;
}
	public int getrowCount(String relativepath,String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(relativepath);
		 Workbook wb = WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet(sheetname);
		  int rc = sh.getLastRowNum();
		return rc;
		
		
	}
	public void writeStatusInExcel(String relativepath,String sheetname,int rowcont,int cellcount,String Data) throws IOException {
		FileInputStream fis = new FileInputStream(relativepath);
		 Workbook wb = WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet(sheetname);
		  Row row = sh.getRow(rowcont);
    Cell cell = row.createCell(cellcount);
    cell.setCellValue(Data);
    FileOutputStream fos = new FileOutputStream(relativepath);
    wb.write(fos);
    
		  
	}
	public String ReadPropertiesFile(String path,String key) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

		
	}
	}

