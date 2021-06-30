package testcasses;

import org.testng.annotations.Test;

public class Test3 {
	
	
	@Test(priority  = 1)	
	public  void doLogin() {
		// TODO Auto-generated method stub
			System.out.println("login3");
	}
	
	
	@Test(priority  = 2)	
	public  void deReg() {
		// TODO Auto-generated method stub
			System.out.println("reg3");
	}
	

	@Test(priority  = 3)	
	public  void dologout() {
		// TODO Auto-generated method stub
			System.out.println("dologout3");
	}

}
