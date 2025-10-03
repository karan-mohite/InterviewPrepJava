class Mahesh
{	
	int x;	//instance(object) member  variable
	private int y;	//instance(object) member  variable
	void fun1()	//instance(object) member function
	{	
		System.out.println("Fun1");
	}
	void fun2() //instance(object) member function
	{			
	   System.out.println("Fun2");
	}
}
class Object2
{	
	public static void main(String args[])
	{	
		Mahesh m1=new Mahesh();
		Mahesh m2=new Mahesh();
		m1.x=5;
		m2.x=51;
 		System.out.println(m2.x);
 		//System.out.println(m2.y);
	}	
}
