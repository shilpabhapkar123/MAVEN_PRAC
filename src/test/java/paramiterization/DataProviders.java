package paramiterization;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "dp1")
	public static Object[][] getData() {
		ExcelReader excel = null;
		if(excel == null) {
			excel = new ExcelReader("F:\\javaSelenium1\\RestAssuredAPI\\src\\test\\resources\\excelReaderFolder\\TestNGData.xlsx");

		}
	String sheetName = "LoginTest";
	Hashtable<String, String> table = null;
	 int rows = excel.getRowCount(sheetName);	
	 int cols = excel.getColumnCount(sheetName);
	 System.out.println( rows +"===="+ cols);
	 Object[][] data = new Object[rows - 1][1];
	 for (int rownum = 2; rownum <= rows; rownum++) {
		  table = new Hashtable<String, String>();
		 for (int colnum = 0; colnum < cols ; colnum++) {
			//data[rownum-2][colnum] = excel.getCellData(sheetName, colnum, rownum );
			 table.put(excel.getCellData(sheetName, colnum, 1 ), excel.getCellData(sheetName, colnum, rownum ));
			 data[rownum-2][0] = table;
			
		}
		
	}
			
		return data;
		
	}
}
