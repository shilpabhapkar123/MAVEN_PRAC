package testcasses;

import org.testng.annotations.Test;

public class Test2 {
	
	
	@Test(priority  = 1)	
	public  void doLogin() {
		// TODO Auto-generated method stub
			System.out.println("login2");
	}
	
	
	@Test(priority  = 2)	
	public  void deReg() {
		// TODO Auto-generated method stub
			System.out.println("re2g");
	}
	

	@Test(priority  = 3)	
	public  void dologout() {
		// TODO Auto-generated method stub
			System.out.println("dologout2");
	}

}
