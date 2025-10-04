import java.io.*;
class ExceptionDemo3
{	
	public static void main(String args[]) 
	{		
		System.out.println("A");
		try
		{
		 throw new IOException("Printer Not Found");
		}
		catch(IOException e1)
		{	
			System.out.println(e1.getMessage());
		}
 	}
}