package Assignment;

public class Primeno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	  for(int num=1; num<=10;num++)
	  {
		  int count=0;
			
		for(int i=1;i<=num;i++)
		{
			
			if(num%i==0)
		{
				count++;
		}
		}
			if(count==2)
			{
		
			System.out.println("num is prime");
			}
			else
			{
				System.out.println("num is not prime");
			}
		
		}

	}


	}


