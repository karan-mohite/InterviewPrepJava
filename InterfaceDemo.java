interface i1
{	    
	int x=6;
	void f1();    
    static void f2()
	{	
		System.out.println(x);
	}		
}	
interface i2 extends i1
{	
	int y=2;
	int x=9;
	static void f2()
	{	
		System.out.println(x);
	}
	void f3();
}
class c1 implements i2
{	
    static void f2()
	{	
		System.out.println(x);
	}	
	public void f1()
	{	
	
	}
	public void f3()
	{	
		
	}	
}	
class InterfaceDemo
{		
	public static void main(String args[])
	{		
		//c1 C1=new c1();
		//System.out.println(C1.x);
		//c1.f2();
		 i2.f2(); 
	}		
}