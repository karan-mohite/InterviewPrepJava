class ExceptionDemo
{	
	public static void main(String args[])
	{	  	
		String s1=null;
		try
		{
			System.out.println(s1.length());
			System.out.println(5/0);
		}
		catch(NullPointerException e)
		{	
			System.out.println(e.getMessage());
		}
	  	catch(ArithmeticException e)
		{	
			System.out.println(e.getMessage());
		}
		System.out.println("A");
	}
}
