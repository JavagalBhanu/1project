package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getData(String path,String sheet,int row,int column) {
		String data="";
		try {
			FileInputStream fis=new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheet);
			Row r = s.getRow(row);
			Cell c = r.getCell(column);
			data= c.getStringCellValue();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}
}
