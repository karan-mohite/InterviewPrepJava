class A
{	
	void fun1()
	{	
		System.out.println("Function 1 Executed..!!");
	}
	void fun1(int x)
	{	
		int y=x;
		System.out.println("Value of Y is:"+y);
	}
	void fun1(int p,int q)
	{	
		int z;
		z=p+q;
		System.out.println("Addition of Two Number:"+z);
	}
}
class FunctionOVerloadingDemo
{
	public static void main(String args[])
	{	
		A a1=new A();
		a1.fun1(20,40);
	}
	
}