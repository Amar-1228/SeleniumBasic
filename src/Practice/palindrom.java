package Practice;
import java.util.Scanner;
public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner obj= new Scanner(System.in);
				System.out.println("Enter the numer to check palindrom :");
				
				int number= obj.nextInt();
						
						
						int rev=0;
						int temp;
						int num=number;
						
														
								
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
					

			
			
			
			

	
	
	
	
	


