package jan12;

public class Execution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bike obj=new Bike();
		
		obj.display();
		obj.displayspeed(40);
		int gear=obj.returngear(4);
		
		System.out.println("the numer of gear is " + gear);
		
}
}
	


