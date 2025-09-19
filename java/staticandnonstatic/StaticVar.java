package staticandnonstatic;

public class StaticVar {

	
	
	String name; //Instance Variables
	String address;//Instance Variables
	static String city;//Class Variable
	
	static int i;
	
	static {
		
		city = "Bangalore";
		i=0;
	}
	
	public StaticVar(String name,String address)//Local Variable
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
		
	}

	public void getAddress() {
		
		System.out.println(address + " "+city);
	}
	
	public static void getCity() {
		
		System.out.println(city);
	}
	public static void main(String[] args) {
		
		StaticVar obj = new StaticVar("Bob","Marthali");
		StaticVar obj1 = new StaticVar("Ram","Jayanagar");
		StaticVar obj2 = new StaticVar("Shyam","Ramnagar");
		obj.getAddress();
		obj1.getAddress();
		obj2.getAddress();
		StaticVar.getCity();
		StaticVar.i=4;
		obj.address ="xyz";
	}

}
