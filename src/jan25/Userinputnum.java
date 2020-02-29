package jan25;

import java.util.Scanner;

public class Userinputnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			Scanner obj= new Scanner(System.in);
			System.out.println("Enter the numer to display math tael :");
			
			int number= obj.nextInt();
			for(int i=1; i<=10;i++)
			
		
			{
				System.out.println(number  +   "X" +i+ "=" + i*number);
				
			
			
	}

}
}