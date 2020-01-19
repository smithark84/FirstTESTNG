package FirstTestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
''
public class ExcelExample {
	

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\general\\eclipse-workspace\\ExcelData.xls");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet("Sheet1");
		Row r  = s.getRow(0);
		Cell c = r.getCell(0);
		System.out.println(c.toString());
		
	}

}
