package jan25;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the numer to display range :");
		
		int number= obj.nextInt();
		
		for(int i=0;i<=number;i++)
		{
	     System.out.println(i);
		}
		
	 }

}
