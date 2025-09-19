package day2RahulShetty;

public class constructDemo {
	
	//Name of Constructor should be same as Class name
	//Constructor will not return values
	
	//Deafult Constructor
	public constructDemo() 
	{
		
		System.out.println(" I am in Constructor");
	}

	//Parameterized Constructor
	 public constructDemo(int a, int b) 
	 {
		 System.out.println(" I am in Parameterized Constructor");
		 int c= a+b;
		 System.out.println(c);
	 }
	 public constructDemo(String str) 
	 {
		 System.out.println(str);
	 }
	
	public void getdata()
	{
		
	 System.out.println("I am the method");
	}
	
	public static void main(String[] args) {
		
		
		constructDemo cd = new constructDemo("hello");
		constructDemo c = new constructDemo(4,5);
		
		//cd.getdata();
		
		//Whenever you create object for class constructor is called 
		//and block of code in constructor is executed automatically
		
		
		

	}

}
