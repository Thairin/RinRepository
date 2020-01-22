/**
 * 
 */
package Lib;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author AdwayHR
 *
 *Adding excel configurations to read data and pass to the dataproviders
 */
public class ExcelConfig {

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelConfig(String path) throws Exception
	{
		File file=new File(path);
		
		FileInputStream fio = new FileInputStream(file);
		
		wb=new XSSFWorkbook(fio);
	}
	
	public String readData(String sheetname,int rowId,int ColId)
	{
		sheet1 = wb.getSheet(sheetname);
	
		String data=sheet1.getRow(rowId).getCell(ColId).getStringCellValue();
		
		return data;
			
	}
	
	public int rowCount(String sheetname)
	{
		sheet1 = wb.getSheet(sheetname);
		
		int rowNum=sheet1.getLastRowNum();
		
		return rowNum+1;
	}
}
