package Utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import config.PropertiesFile;

public class ExcelDataProviderUsingTestNG {
	PropertiesFile propfiles= new PropertiesFile();

	@Test(dataProvider = "test1data")
	public void testgetdata(String uname,String upwd) {
		//System.out.println(uname+upwd);

	}

	@DataProvider(name = "test1data")
	public Object[][] getData() throws Exception {

		Object data[][] = testData(propfiles.getFilePath(), "Sheet1");
		return data;
		}

	public Object[][] testData(String excelPath,String excelSheet) throws Exception {
		ExcelUtils excelObj = new ExcelUtils(excelPath, excelSheet);
		int rowCount = excelObj.getRowCount();
		int colCount = excelObj.getColCount();
		Object data[][] = new Object[rowCount-1][colCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String cellData = ExcelUtils.getCellData(i, j);
				//System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
			}
			//System.out.println();
		}
		return data;
	}

}
