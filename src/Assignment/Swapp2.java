package Assignment;

import java.util.Scanner;

public class Swapp2 {
    int a;
	int b ;
	
	Swapp2(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void swap(){
		int c = 0;
		c = a;
		a = b;
		b = c;
		
		System.out.println(" after swap value of a  is : "+ a );
		System.out.println(" after swap alue of  b is  : "+ b );
		
	}
	
	public static void main(String args[]){

			// 2. take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for a :" );
		int a = sc.nextInt();
		
		System.out.println(" enter value for b : ");
		int b = sc.nextInt();
		
		Swapp2 obj2 = new Swapp2(a,b);
		
		obj2.swap();
		
	
		
		
		
				
	}
	

}

