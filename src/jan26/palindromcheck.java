package jan26;
import java.util.Scanner;
public class palindromcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner obj= new Scanner(System.in);
				System.out.println("Enter the numer to check palindrom :");
				
				int number= obj.nextInt();
				checknumberpalindrom(int num);
				obj.nextLine();
				System.out.println("Do you want to continue(yes/no)");
					
				while(userchoice.epuals("yes"))	
					{
						System.out.println("Ente the numer");
						num=obj.nextInt();
						checknumberpalindrom(int num);
					
						System.out.println("Do you want to continue(yes/no)");
						userchoice=objString.nextline();
					}
						
						System.out.println("no is not palindron");
							}
									
	

                  static  void checknumberpalindrom(int num)
                  {

                	  int rev=0;
						int temp;
						int number=num;
						
														
								
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






						
				
					

			
			
			
			

	
	
	
	
	


