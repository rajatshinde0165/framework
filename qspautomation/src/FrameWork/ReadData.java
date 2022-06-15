package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 FileInputStream fis = new FileInputStream("./data/test data.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    Sheet sh = wb.getSheet("Sheet1");
    Row row = sh.getRow(0);
    Cell cell = row.getCell(1);
    String value = cell.getStringCellValue();
    System.out.println(value);
int rc = sh.getLastRowNum();
System.out.println(rc);
	}

}
