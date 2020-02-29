package Assignment;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//for(int num=1;num<=1000;num++)	
		int num=121;
		int rev=0;
		int temp;
		int number=num;
		
					
			/*	while(numer>0)
		{
			temp=number%10;
			rev =(rev * 10)+temp;
			number=numer/10;
		}
		
		if(number== rev)
		{
			System.out.println("no is palindrom");
		}*/
		
				
		while(num>0)
		{
			temp=num%10;
			rev =(rev * 10)+temp;
			num=num/10;
		}
		
		if(number== rev)
		{
			System.out.println("no is palindrom");
		}
			
			else
			{
				System.out.println("no is not palindron");
			}
					
		}
		
		
	}
	
