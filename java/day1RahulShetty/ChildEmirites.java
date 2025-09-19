package day1RahulShetty;

public class ChildEmirites extends ParentAirCraft{

	public static void main(String[] args) {
		
		
	ChildEmirites c = new ChildEmirites();
	c.engine();
	c.safetyGuidelines();
	c.bodycolor();
		
	}

	@Override
	public void bodycolor() {
		
	System.out.println("Red Color on the body");
		
	}

}
