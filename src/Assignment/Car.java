package Assignment;

public class Car {

	String name ,color;
	int year;
	
	
	Car(String iname,String icolor,int iyear)
	{
		
		name=iname;
		color=icolor;
		year=iyear;
	}
	
void displaydetails()
{
	System.out.println("Name of car is: " + name);
	System.out.println( name + " car colors is : " + color);
	System.out.println( name + " car manufacture  year is : " +  year );
}
 
void changegear(int gearno)
 {
	System.out.println("changing to gear: "+ gearno);
	
 }

int applyBreak(int speed)

{
	return speed;
}

}


