package testcasses;

import org.testng.annotations.Test;

public class Test1 {
	
	
	@Test(priority  = 1)	
	public  void doLogin() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("login");
		throw new Exception();
	}
	
	
	@Test(priority  = 2)	
	public  void deReg() {
		// TODO Auto-generated method stub
			System.out.println("reg");
	}
	

	@Test(priority  = 3)	
	public  void dologout() {
		// TODO Auto-generated method stub
			System.out.println("dologout");
	}

}
