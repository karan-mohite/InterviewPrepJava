import java.util.*;
class IteratorDemo
{	
	 
	public static void main(String args[])
	{	
		Vector v1=new Vector();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		v1.add("D");
		v1.add("E");
		
		Iterator e1=v1.iterator();
		
		while(e1.hasNext())
		{	
			String s1=(String)e1.next();
			if(s1=="D" || s1=="A")
			{	
				e1.remove();
			}
			else
			{	
				System.out.println(s1);
			}
		}
	}
	
}