class A
{
	void fun()
	{
		System.out.println("Class A is Executed..!!");
	}
}
class B extends A
{	
	void fun()
	{	
		super.fun();
		System.out.println("Class B is Executed..!!");
	}	
}
class FunctionOverridingDemo
{	
	public static void main(String args[])
	{	
		B b1=new B();
		b1.fun();
	}
}