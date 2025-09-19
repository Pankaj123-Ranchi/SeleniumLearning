package day2RahulShetty;

public class childDemo extends parentDemo {
	
	
	String name = "QAClickAcademy";
	
	public childDemo() {
		
		super(); //It should always be at the first line
		
		System.out.println("Child class constructor");
	}
	
	public void getStringdata()
	{
		
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		
		
		super.getData();
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		
		childDemo cd = new childDemo();
		
		cd.getStringdata();
		cd.getData();

    }

}
