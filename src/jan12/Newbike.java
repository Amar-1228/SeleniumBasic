package jan12;

public class Newbike {
	
	String name;
	int speed;
	int gears;
	
	Newbike(String iname, int ispeed, int igears)
	{
		name=iname;
		speed=ispeed;
		gears=igears;
	}
	
	void  displayname()
	{
		System.out.println("the name of bike is: " + name);
	}
	void  displayspeed()
	{
		System.out.println("the speed of bike is: " + speed);
	}
  int returngear()
  {
    return gears;
}

}


