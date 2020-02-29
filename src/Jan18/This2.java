package Jan18;

public class This2 {

		
		int counter=0;
		static int counter1=0;
		

	void increment()
	{
		counter++;
        counter1++;
         
         
		this.display();
	}

	void display()
	{
		System.out.println("counter :" + counter);
		System.out.println("counter1 :" + counter1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		This2  obj=new This2();
		
	    obj.increment();
	    
	
	
	}

}





