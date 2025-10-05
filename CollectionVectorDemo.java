import java.util.*;
class CollectionVectorDemo
{	
	public static void main(String args[])
	{	
		Vector v=new Vector(5);
		v.add(10);	
		v.add(20);
		v.add(30);
		v.add("Vishal");
		v.add(50);
		System.out.println(v);   

		Stack s1=new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		System.out.println(s1.search(30));
		System.out.println(s1.peek());
		System.out.println(s1.empty());		
	}
}