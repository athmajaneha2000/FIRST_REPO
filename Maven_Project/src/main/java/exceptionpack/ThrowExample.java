package exceptionpack;

public class ThrowExample
{


	public static void main(String[] args) throws Throwable
	{
		int age = 15;
		if(age>18)
		{
			System.out.println("eligible for printing");
		}
		else
		{
			throw new Exception("not elegible");
		}
		
		// TODO Auto-generated method stub

	}

}
