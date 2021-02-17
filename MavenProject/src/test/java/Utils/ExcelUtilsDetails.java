package Utils;

import java.io.IOException;

public class ExcelUtilsDetails {

	public static void main(String[] args) throws IOException {
		ExcelUtils excelUtil = new ExcelUtils("C:/Users/Canada/eclipse-workspace/MavenProject/ExcelData/Data.xlsx", "Sheet1");
					excelUtil.getRowData(0, 1);

	}

}
