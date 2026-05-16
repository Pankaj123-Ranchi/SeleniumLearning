package selenium22TestNG_Test_annotation;

import org.testng.annotations.Test;

/*
 1.)Open Application
 2.)Login to Application
 3.)Logout from Application
 */


public class FirstTestCase 

{
	@Test(priority=1)
	void openapp()
	{
		System.out.println("Opening application....");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("Login to application....");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logout from apploication....");
	}

}
