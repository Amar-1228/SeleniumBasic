package Assignment;
public class SwappingNumbers {
	int a ,b = 0;
	
	/*SwappingNumbers(int a, int b){
		this.a = a;
		this.b = b;*/
		
		void display(int a , int b)
		{
		System.out.println("before swap a:  "  + a);
		System.out.println("before swap b:  " + b);
		
		}
		
		void swap(int a ,int b){
		int c = 0;
		c = a;
		a = b;
		b = c;
		
		System.out.println("After swap a : "+ a );
		System.out.println("After swap b : "+ b);
		}
	
	  public static void main(String args[])
	   {
		
		SwappingNumbers obj = new SwappingNumbers();
		
		int a=5 ; int b=2;
		obj.display(a,b);
		obj.swap(a,b);
		}
	}
