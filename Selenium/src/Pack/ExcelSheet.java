package Pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		String path = "C:\\Users\\Akash\\OneDrive\\Desktop\\text.xlsx";
		
		FileInputStream file  =  new FileInputStream(path);
		
		Workbook a = WorkbookFactory.create(file);
		Sheet s = a.getSheet("Sheet1");
		s.getLastRowNum();
		Row r = s.getRow(0);
		r.getLastCellNum();
		Cell c = r.getCell(2);
		String value = c.getStringCellValue();
		//double d = c.getNumericCellValue();
		System.out.println(value);
		a.close();
	}
	
	
	
}
