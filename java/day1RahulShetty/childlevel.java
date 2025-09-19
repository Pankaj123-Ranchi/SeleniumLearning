package day1RahulShetty;

//function overloading
//Either Argument count should be different
//Or Argument Data Type should be different.
public class childlevel {

	
	public void getData(int a) {
		
		System.out.println(a);
		
	}
    public void getData(String a) {
    	
    	System.out.println(a);
		
	}

    public void getData(int a, int b) {
	
    	System.out.println(a+b);
}
	public static void main(String[] args) {
		
		childlevel cl = new childlevel();
		cl.getData(2);
		cl.getData("Pankaj");
		cl.getData(10,20);

	}

}
