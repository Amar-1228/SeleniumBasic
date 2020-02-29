package Jan18;

public class Staticinstantvariale {

	
	
	int   counter=0;
	static int counter1=0;
	

void increment()
{
	counter++;
	counter1++;
}

void display()
{
	System.out.println("counter :" + counter);
	System.out.println("counter1 :" + counter1);
}
}

