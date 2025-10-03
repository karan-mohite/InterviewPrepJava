//This keyword Demo
class Example
{	
	private int x;
	private int y;
	
	void f1(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{	
		System.out.println(x);
		System.out.println(y);		
	}
}

class ThisDemo
{	
	public static void main(String args[])
	{	
		Example e1=new Example();
		e1.f1(10,20);
		e1.display();
		
		Example e2=new Example();
	}
}