package selenium24TestNG__DependencyMethods__GroupingTests;

import org.testng.annotations.Test;

public class SignupTests 

{
   @Test(priority=1,groups= {"regression"})
   void signupbyemail()
   {
	   System.out.println("This is signup by email...");
   }
	
   
   @Test(priority=2,groups= {"regression"})
   void signupbyfacebook()
   {
	   System.out.println("This is signup by facebook...");
   }
   

   @Test(priority=3,groups= {"regression"})
   void signupbyTwitter()
   {
	   System.out.println("This is signup by twitter...");
   }
	
	
}
