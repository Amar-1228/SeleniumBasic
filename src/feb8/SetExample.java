package feb8;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashSet<String> set = new HashSet <>();
		
		set.add("maharashtra");
		set.add("pune");
		set.add("satara");
		set.add("maharashtra");
		set.add(null);
		set.add(null);
	System.out.println(set);// set function cannot print duplicate element
	
	for(String s : set)
	{
	System.out.println(s);	
	}
	
	}

}
