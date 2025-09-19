package exceptionJavaRahulShetty;
//one try can be followed by multiple catch blocks
//catch should be an immediate block after try
public class exceptionDemo {


	public static void main(String[] args) {
		
		int b= 7;
		int c= 0;
		
		//try - catch Mechanism
		try {
			//int k = b/c;
			
			int arr[]=new int[5];
			
			System.out.println(arr[7]);
			//System.out.println(k);
			}
		
		catch(ArithmeticException et) {
			
		System.out.println("I catched the Arithmetic exception");
			
		}
		catch(IndexOutOfBoundsException et) {
			
			System.out.println("I catched the IndexOutOfBoundsException");
				
			}
		
		catch(Exception e)
		
		{
			System.out.println(e);
			System.out.println("I catched the error/exception, end of code");
			
		}
		
		finally
		{
			
		//This block is executed irrespective of exception thrown or not
			
			System.out.println("Delete Cookies");
		}
		
		
	}

}
