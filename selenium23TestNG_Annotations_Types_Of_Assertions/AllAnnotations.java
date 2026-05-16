package selenium23TestNG_Annotations_Types_Of_Assertions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	
	@BeforeSuite
	 void bs()
	 {
		 System.out.println("This is BeforeSuite ...");
	 }
	@AfterSuite
	 void as()
	 {
		 System.out.println("This is AfterSuite ...");
	}
	@BeforeTest
	void bt()
	{
    System.out.println("This is BeforeTest method .... ");
    }
	@AfterTest
	void at()
	{
	System.out.println("This is AfterTest method .... ");
    }
	 
	@BeforeClass
	void bc()
	{
    System.out.println("This is BeforeClass method .... ");
    }
	@AfterClass
	void ac()
	{
	System.out.println("This is AfterClass method .... ");
    }
	
	@BeforeMethod
	void bm()
	{
    System.out.println("This is Before method .... ");
    }
	@AfterMethod
	void am()
	{
	System.out.println("This is After method .... ");
    }
	
	@Test(priority=1)
	void tm1()
	{
		System.out.println(" This is Test Method1....");
	}
	@Test(priority=2)
	void tm2()
	{
		System.out.println(" This is Test Method2....");
	}

}
