class Nokia1
{	
	int x,y;
	Nokia1()
	{	
		System.out.println("Parent's  constructed Executed..!!");		
	}		
	void f1()
	{
		System.out.println("Parent  Function 1 Executed..!!");		
	}
	void f2()
	{	
		System.out.println("Parent Function 2 Executed..!!");
	}
}
class Nokia2 extends Nokia1
{	
	int z;
	void f3()
	{		
		System.out.println("Child Function 1 Executed..!!");
	}
	Nokia2()
	{	
	 System.out.println("Child  Constructor  Executed..!!");		
	}
}
class HirarchicalInheritanceDemo
{	
	public static void main(String args[])
	{	
		Nokia2 n1=new Nokia2();
		
	}
}