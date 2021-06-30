package paramiterization;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngparamExcel {
	@Test(dataProviderClass = DataProviders.class  ,dataProvider = "dp1")
	public void doLogin(Hashtable<String, String> table) {
		
	//	System.out.println(uname +"============" +pswd +"========="+is_correct);
		System.out.println(table.get("uname"));
	}
	
	
}
