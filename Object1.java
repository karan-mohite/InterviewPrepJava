class Karan
{
	int x;	//instance(object)member variable 		
	private int y;	//instance(object)member variable
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
		Karan k2=new Karan();
		k1.x=5;
		System.out.println("Hello");
		System.out.println(k1.x);
		System.out.println(k2.y);
	}	
}