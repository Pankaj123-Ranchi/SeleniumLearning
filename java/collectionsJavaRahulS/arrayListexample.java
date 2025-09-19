package collectionsJavaRahulS;

import java.util.ArrayList;

public class arrayListexample {

	public static void main(String[] args) {
		
		//can accept duplicate values
		//ArrayList,LinkedList, Vector--- Implementing List Interface
		//Array have fixed size whereas ArrayList can grow dynamically
		//You can access or insert any value in any index
		
		ArrayList<String> a = new ArrayList<String>(); 
		a.add("Rahul");
		a.add("java");
		a.add("java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		/*a.remove(2);
		a.remove("java");
		System.out.println(a);*/
		//a.get(2);
		System.out.println(a.get(2));
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("java"));
		System.out.println(a.indexOf("Rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

	}

}
