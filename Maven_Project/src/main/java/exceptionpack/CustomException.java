package exceptionpack;

public class CustomException 
{

	public static void main(String[] args) throws VotingException 
	{
		int age=15;
		if(age>18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new VotingException("not elegible");
		}
		// TODO Auto-generated method stub

	}

}
