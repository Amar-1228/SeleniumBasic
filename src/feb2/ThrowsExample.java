package feb2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class ThrowsExample {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		openfile("abc.txt");
	}
	
	public static void openfile(String path )throws FileNotFoundException
	
	{
		File  fh=new File(path);
		FileInputStream io= new FileInputStream(fh);
	}
	
public static void myException(String browsername )throws Exception
	
	{
		if(browsername.equals("chrome"));
		System.out.println("chrome");
	
	
	}
}