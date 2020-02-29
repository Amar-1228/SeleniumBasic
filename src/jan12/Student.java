package jan12;

public class Student {

	String name;
	int id;
	String collegeName;
	String department;
	
	Student(String iname, int iid,String icolle, String idepartment) 
	{
		
		name=iname;
		id=iid;
		collegeName= icolle;
		department=idepartment;
	}

	Student(String iname, int iid, String idepartment) 
	{
		
		name=iname;
		id=iid;
		collegeName= "svpm";
		department=idepartment;
	}


 void attendlecture()
 {
	 System.out.println(name +"attendlecture");
	 
 }

void appearforexam()
{
System.out.println(name +" appearforexam"+ id);
}
void studiesindepartmenrt()

{
	System.out.println(name + " studiesindepartmenrt" + department);
	
	
}
void goestocolleage()
{
	System.out.println(name + " goestocolleage " + collegeName );
}




String returnname()  // when we define method string then it return value 
{
	
	return name;
}
int returid()
{
	
	return id;
}

}











