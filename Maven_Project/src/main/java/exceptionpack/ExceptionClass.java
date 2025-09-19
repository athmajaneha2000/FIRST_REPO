package exceptionpack;

public class ExceptionClass {

	public static void main(String[] args) 
	{
	
			
		try {
		
		
	    int a=2;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		/*catch(ArithmeticException c)
		{
			System.out.println("Exception handled");
		}*/
		finally
		{
			System.out.println("Exit code");
		}
		
	
		// TODO Auto-generated method stub

	 /*int ar[]= {2,3,4};
		for(int i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}*/
		
		/*String s = null;
		System.out.println(s.length());
	*/
	}
	
}
