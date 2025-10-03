class Area
{	
	 void fun1()
	{	
		System.out.println("Area 1");
	}
      void fun2()
	{	
		System.out.println("Area 2");
	}	
}
class Example2
{	
	void fun1()
	{	
		System.out.println("A");
	}
	 void fun2()
	{	
		System.out.println("B");
	}
	public static void main(String args[])
	{	
		Area a1=new Area();
		a1.fun1();
		a1.fun2();		
	}
}