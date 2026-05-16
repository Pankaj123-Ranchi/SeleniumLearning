package selenium23TestNG_Annotations_Types_Of_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions 
{
	
	//@Test
	void test_hardassertions()
	{
		System.out.println("testing1.....");
		System.out.println("testing2.....");
		
		Assert.assertEquals(1, 2);//hard assertion
		
		System.out.println("testing3.....");
		System.out.println("testing4.....");
		
	}
	
	@Test
	void test_softassertion()
	{
		System.out.println("testing1.....");
		System.out.println("testing2.....");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(1, 2);//soft assertion;
		
		System.out.println("testing3.....");
		System.out.println("testing4.....");
		
		sa.assertAll();//mandatory
	}

}
