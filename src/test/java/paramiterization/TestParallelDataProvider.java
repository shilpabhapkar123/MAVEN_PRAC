package paramiterization;

import java.util.Date;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParallelDataProvider {
	
	@Test(dataProvider = "getData")
	public void doLogin(String str) {
		Date d = new Date();
	//	System.out.println(uname +"============" +pswd +"========="+is_correct);
		System.out.println(str+"===="+d);
		System.out.println(str+"===="+d);
	}
	
	@DataProvider(parallel= true)
	public Object[][] getData(){
		Object[][] data = new Object[2][1];
		data[0][0] =  "chr";
				data[1][0] ="fire";
		return data;
		
	}
	

}
