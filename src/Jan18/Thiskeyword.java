package Jan18;

import Assignment.Car;

public class Thiskeyword {
	

		String name;
		String color;
		int year;
		
		
		Thiskeyword(String name,String color,int year)
		{
			
			this.name=name;
			this.color=color;
			this.year=year;
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

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiskeyword my=new Thiskeyword("Swift","White",2019);
		my.displaydetails();

		my.changegear(4);
				
		int speed=my.applyBreak(+90);
			System.out.println("apply break after speed cross : " + speed);	

}
}