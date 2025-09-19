package collectionsJavaRahulS;

import java.util.ArrayList;

public class collectiondemo {

	public static void main(String[] args) {
	int arr [] = {4,5,5,5,4,6,6,9,4};

		//Print unique number from the list
		//4-->3, 5--->3,6--->2,9--->1 //Empty ArrayList
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		for (int i =0; i<arr.length; i++)
			
		{
			int k=0;
			if (!ab.contains(arr[i]))
			{
				ab.add(arr[i]);
				k++;
				
				for (int j=i+1;j<arr.length;j++) {
					
					if (arr[i]==arr[j]) {
						k++;
					}
				}
			System.out.println(arr[i]+  " is repeated " + k + " times");
			//System.out.println ("No is repeated "+  k +  " times" );
			
			if (k==1)
				
			{
				System.out.println(arr[i] + " is a unique number");
			}
			}
		}
	}

}
