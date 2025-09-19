package day2RahulShetty;

public class thisDemo {
	
	int  a= 2;
	
	public void getData()
	{
		
		int a= 3;
		int b = a + this.a;
		System.out.println(a);
		
		//this refers to current object - object scope lies in class level
		
		System.out.println(this.a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		
     thisDemo td = new thisDemo();
     
     td.getData();
		
		
	}

}
