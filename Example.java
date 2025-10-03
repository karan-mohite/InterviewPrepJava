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
class Example	
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
		System.out.println("C");
		Area.fun1();
		Area.fun2();
		Example.fun1();
		Example.fun2();
	}
}