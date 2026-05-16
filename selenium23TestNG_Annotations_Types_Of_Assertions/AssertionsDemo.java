package selenium23TestNG_Annotations_Types_Of_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	@Test
	void testTitle()
	{
		String exp_title="Opencart";
		String act_title="Opencar";
		
		/*if(exp_title.equals(act_title))
			
		{
			System.out.println("test Passed");
		}
		else
		{
			System.out.println("test failed");
		}*/
		
		//Assert.assertEquals(exp_title, act_title);
		
       if(exp_title.equals(act_title))
			
		{
			System.out.println("test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
	}

}
