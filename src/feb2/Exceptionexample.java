package feb2;

import java.util.Scanner;

public class Exceptionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter the first no :");
     
     int x =obj.nextInt();
     
    	int z=0;
    	
    	 System.out.println("Enter the second no :");
         
         int y =obj.nextInt();
         
           
        
            try
         {
            	 z=x/y;
        	 System.out.println(z);
        	 
         }
    	catch(Exception e)
         {
         System.out.println("exception cannot divide by zero");
         e.getMessage();
    	z=5;
    	
    		 
	}

 finally {
	 
	 System.out.println("i am finaly block");
	 
 }
	}
}
