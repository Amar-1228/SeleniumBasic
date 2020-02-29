package Assignment;

public class DivisibleBy3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	for(int i=1;i<=100;i++)
	{
		
		if( i % 3==0 &&  i % 5==0 )
		{
			
			System.out.println("NO is divisile by 3 and 5 : " + i);
	
		}
		if(i%3==0)
		{
			System.out.println("NO is divisile by 3  : " + i);	
		}
			else
				if(i%5==0)
				
				{
					System.out.println("No divisile By 5 : " + i);
	   
	}
	
}
}
}