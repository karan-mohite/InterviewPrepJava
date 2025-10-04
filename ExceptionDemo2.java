class ExceptionDemo2
{	
	public static void main(String args[])
	{	
		int cb=10000;
		int wb=14000;
		
		try
		{
		 if(cb<wb)
		 {	
			throw new ArithmeticException("Insufficient Balance..!!");
		 }
		cb=cb-wb; 
		System.out.println("Transaction Successful");
		System.out.println("Current Balance is:"+cb);
	    }
		catch(ArithmeticException e1)
		{	
			System.out.println(e1.getMessage());	
			System.out.println("Current Balance is:"+cb);
		}
	}
}
 