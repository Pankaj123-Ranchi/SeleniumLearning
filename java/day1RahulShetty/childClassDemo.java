package day1RahulShetty;

public class childClassDemo extends parentClassDemo{
	
	
	public void audiosystem() {
		
		System.out.println("new audio child");
	}
	
	public void engine()
	{
		System.out.println("new engine");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}

	
	public static void main (String [] args) {
		
		
		childClassDemo cd = new childClassDemo();
		
		cd.colour();
		cd.Brakes();
		cd.audiosystem();
		
	}
}
