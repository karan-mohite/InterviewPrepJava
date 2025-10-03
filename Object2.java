class Mahesh
{	
	void fun1()
	{	
		System.out.println("Fun1");
	}
	void fun2()
	{			
	   System.out.println("Fun2");
	}
}
class Object2
{	
	public static void main(String args[])
	{	
		Mahesh m1=new Mahesh();
		m1.fun1();
		m1.fun2();
	}	
}