import java.util.*;
class CollectionArrayListDemo
{	
	public static void main(String args[])
	{       
		ArrayList a1=new ArrayList(5);
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add(2,"G");
		
		Iterator g1=a1.iterator();
		
		while(g1.hasNext())
		{	
			String s1=(String)g1.next();
			if(s1!="G")
			{
				System.out.println(s1);
			}
		}
	}
}

	