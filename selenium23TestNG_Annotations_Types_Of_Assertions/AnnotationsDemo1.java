package selenium23TestNG_Annotations_Types_Of_Assertions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*1) Login1 -- @BeforeMethod
2) Search --- @Test
3) Logout ----@AfterMethod
4) Login
5) Adv search--- @Test
6) Logout
*/

public class AnnotationsDemo1 {
	
	@BeforeMethod
	void login()
	{
		System.out.println("This is Login...");
	}
	
   @Test(priority=1)
	void search()
	{
		System.out.println("This is Search...");
	}
	
    @Test(priority=2)
	void advancedsearch()
	{
		System.out.println("Advanced Search...");
	}

    @AfterMethod
	void logout()
	{
		System.out.println("This is Logout");
	}

}
