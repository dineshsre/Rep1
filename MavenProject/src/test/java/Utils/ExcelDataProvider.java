package Utils;

import java.io.IOException;

import org.testng.reporters.jq.Main;

public class ExcelDataProvider {
	public static void main(String[] args) throws Exception {

		testData("C:/Users/Canada/eclipse-workspace/MavenProject/ExcelData/Data.xlsx", "Sheet1");

	}
	public static Object[][] testData(String excelPath,String excelSheet) throws Exception {
			
		
			ExcelUtils excelObj = new ExcelUtils(excelPath, excelSheet);
			int rowCount = excelObj.getRowCount();
			int colCount = excelObj.getColCount();
			Object data[][] = new Object[rowCount-1][colCount];
			for (int i = 1; i < rowCount; i++) {
				for (int j = 0; j < colCount; j++) {
					String cellData = ExcelUtils.getCellData(i, j);
					System.out.print(cellData+" | ");
					data[i-1][j] = cellData;
				}
				System.out.println();
			}
			return data;
	}
		
}
