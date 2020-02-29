package feb8;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> obj=new ArrayList<>();
	
	obj.add("pune");
	obj.add("mumbai");
	obj.add("nashik");
	obj.add("pune");
	obj.add("latur");
	obj.add("satara");
	
	
	System.out.println(obj);
	
	System.out.println(obj.size());
	
	System.out.println(obj.contains("mumbai"));//this is used  to check  element "mumbai"is present if yes then print true otherwise print flase
	
	System.out.println(obj.indexOf("pune"));//position of element
	
	System.out.println(obj.get(4));
	
	List<String> newlist=obj.subList(0,3);
	
	newlist.add("delhi");
	System.out.println(newlist);//this wiil add the string delhi after  after nashik
	
	System.out.println(obj);
	obj.remove("delhi");
	
	for(int i=0; i<obj.size();i++)
		
	{
		System.out.print(obj.get(i) +  " ");
	}
		System.out.println();
		for(String value : obj)
		{
			System.out.println(value);
		}
	}
	
	}


