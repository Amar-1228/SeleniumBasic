package feb1;

public class NotString {

	public static void main(String[] args) {
		
		NotString obj= new NotString();
		
		obj.startswithNot("amol");
		obj.startswithNot("notamar");
		
	}
		// TODO Auto-generated method stub
		
		/*String name ="pune";
		
		//String uppername=name.toUpperCase();//to store result we use one variavle here
		
		//System.out.println(uppername);
		System.out.println(name.toUpperCase());//here we just print  string give value*/
		
		
		
		public void  startswithNot(String value)
		{
			boolean result=value.startsWith("not");
			
			if(result)
			{
				System.out.println("String start with   not" + value);
				
			}else
			{
				System.out.println("String  does not start with   not" + value);
				
				
				
			}
		}
		
		}
		
		
		

