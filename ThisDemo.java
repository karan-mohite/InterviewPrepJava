//This keyword Demo
class Example
{	
	  int x;
	  int y;
	
	void f1(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{		
		System.out.println(this.x);
		System.out.println(this.y);		
	}
}
class Example1 extends Example
{	
	int x,y;
	void f3(int x,int y)
	{	
		super.x=x;
		super.y=y;
	}
	void f4()
	{	
		
		System.out.println(super.x);
		System.out.println(this.y);		
	}
	
}
class ThisDemo
{	
	public static void main(String args[])
	{	
		Example1 e1=new Example1();
		e1.f3(7,9);
		e1.f4();
		
		/*
		Example e1=new Example();
		e1.f1(10,20);
		e1.display();
		Example e2=new Example();
		
		*/
	}
}