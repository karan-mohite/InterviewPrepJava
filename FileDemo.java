import java.io.*;
class FileDemo
{	
	public static void main(String args[])throws IOException
	{		
	
		File f1=new File("a.txt");
			
		//f1.createNewFile();
		
		System.out.println(f1.exists());
		System.out.println(f1.canWrite());
		System.out.println(f1.length());
		
 	}
}