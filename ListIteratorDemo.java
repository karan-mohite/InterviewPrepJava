import java.util.*;
class ListIteratorDemo
{	
	 
	 
	public static void main(String args[])
	{	
		Vector v1=new Vector();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		v1.add("D");
		v1.add("E");
		ListIterator l1=v1.listIterator();
		while(l1.hasNext())
		{	
			String s1=(String)l1.next();
			if(s1.equals("A"))
			{		
				l1.set("C programming");
			}
			else if(s1.equals("B"))
			{	
				l1.set("C++ programming");
			}
			else if(s1.equals("C"))
			{
				l1.add("Python");
			}
			else if(s1.equals("D"))
			{	
				l1.remove();
			}
		}
		
	    l1=v1.listIterator();
		while(l1.hasNext())
		{	
			System.out.println(l1.next());	
		}
	}
}