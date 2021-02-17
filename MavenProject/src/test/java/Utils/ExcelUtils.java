package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workBook;
	static XSSFSheet workSheet;

	public ExcelUtils(String excelPath,String excelSheet) throws IOException{

		workBook = new XSSFWorkbook(excelPath);
		workSheet =  workBook.getSheet(excelSheet);
	}
	public static int getRowCount() throws IOException {

		int rowCount = workSheet.getPhysicalNumberOfRows();
		return rowCount;
	}
	public static int getColCount() throws IOException {

		int colCount = workSheet.getRow(0).getPhysicalNumberOfCells();
		return colCount;
	}
	public static String getCellData(int rownum,int colnum) throws IOException {

		String cellData = workSheet.getRow(rownum).getCell(colnum).getStringCellValue();
		return cellData;
	}
	public static void getRowData(int rownum,int colnum) throws IOException {

		String cellValue = workSheet.getRow(rownum).getCell(colnum).getStringCellValue();
		System.out.println("Cell Value = "+cellValue);
	}
	
	public static void main(String[] args) throws IOException {
		getRowCount();
		getRowData(1,1);

	}


}
