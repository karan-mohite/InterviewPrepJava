class Karan
{
	int x;	//instance(object)member variable 		
	int y;	//instance(object)member variable
	void fun1()	//instance(object)member functions
	{	
	   System.out.println("fun1");
	}
	void fun2() //instance(object)member functions
	{			
	   System.out.println("fun2");
	}
}
class Object1
{	
	public static void main(String args[])
	{	
		Karan k1=new Karan();
		k1.fun1();
		k1.fun2();	
	}	
}