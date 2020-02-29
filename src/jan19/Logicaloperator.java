package jan19;

public class Logicaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x =25;
	int y=40;
	int z=50;
	int b=15;
	
	
	System.out.println((x>y)  && (x>z));  /// AND Operation
	
	System.out.println(!((x>y)  && (x>z)));  //logical not
	
	
	System.out.println(( z>x   ||  z<y));  // OR operation
	
	
	boolean  add =(( z>x   ||  z<y));  // return type is boolean 
	
	System.out.println( add);
	
	
	}
	
	

}
