package feb1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new  Scanner(System.in);
		System.out.println("enter String to reverse");
		String value=obj.nextLine();
		reverseString(value);
	}

	  static void reverseString(String input)
	{
		String reverse="";
		int length=input.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse+input.charAt(i);
	
	
	
	System.out.println("reverse" + input + " is " + reverse );
}

}