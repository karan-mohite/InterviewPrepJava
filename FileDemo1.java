import java.io.*;
class FileDemo1
{	
	public static void main(String args[])throws IOException
	{	
		String s1="Karan Mohite";
		//File h1=new File("a.txt");
		FileOutputStream f1=new FileOutputStream("a.txt",true);
		//f1.write('C');
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{	
			f1.write(ch[i]);
		}
		f1.close();
	}
}