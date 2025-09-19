package collectionsJavaRahulS;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {

	public static void main(String[] args) {
		
		
	//HashSet,Treeset,LinkedHashSet---> 3 classes implements Set Interface
	//Set doesnot accept duplicate values
	//There is no gurantee elements stored in sequential order, stored in random Order
		
		
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		//hs.add("INDIA");//Rejected Duplicate value as it is already present
		/*System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());*/
		
		Iterator<String> i= hs.iterator();
		
		while(i.hasNext()) {
		System.out.println(i.next());
		
	}
		
	}
}

