package Assignment;

public class Execution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car my=new Car("Swift","White",2019);
		my.displaydetails();

		my.changegear(4);
				
		int speed=my.applyBreak(+90);
			System.out.println("apply break after speed cross : " + speed);
		}

	}

