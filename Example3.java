class Area
{	
	static void fun1()
	{
	 System.out.println("Area 1");
	}
	static void fun2()
 	{	
	 System.out.println("Area 2");
	}
}
class Example3
{	
	static void fun1()
	{
	 System.out.println("A");
	}
	static void fun2()
 	{	
	 System.out.println("B");
	}
	public static void main(String args[])
	{	
		Area.fun1();
		Area.fun2();
		//fun1();
		//fun2();
		Example3.fun1();
		Example3.fun2();	
		System.out.println("C");
 	}
}