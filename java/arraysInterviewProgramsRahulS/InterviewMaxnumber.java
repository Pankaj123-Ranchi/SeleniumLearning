package arraysInterviewProgramsRahulS;

public class InterviewMaxnumber {

	public static void main(String[] args) {
		
		
		int abc[][] = {{2,4,5},{3,4,7},{1,2,9}};
		
		int max = abc[0][0];
		System.out.println(abc.length);
		
		for(int i=0; i<3; i++) 
		{
			
			for(int j=0; j<3; j++)
			{
				
				
				
				if (max< abc[i][j]) {
					
					max = abc[i][j];
				}
			}
	    }
		
		System.out.println(max);

    }
	
}
