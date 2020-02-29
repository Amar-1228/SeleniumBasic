package jan12;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student amar=new Student("amar" , 123 ,"coep","Computer");
		amar.attendlecture();
		amar.goestocolleage();
		
		
		Student sneha=new Student("sneha",233,"IT");
		
		sneha.goestocolleage();
		sneha.appearforexam();
		sneha.attendlecture();
		

		String name=sneha.returnname();
				{
				System.out.println(name);
				}
		int id=sneha.returid();
				{
		System.out.println(id);
	}
	}

	
	
	

}
