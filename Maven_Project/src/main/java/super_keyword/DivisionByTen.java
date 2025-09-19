package super_keyword;

public class DivisionByTen extends Sum
{
	public void check()
	{
		super.add();
	
	if(sum % 10 == 0)
	{
		System.out.println(" Divisible by 10");
	}
	else
	{
		System.out.println("Not divisible by 10");
	}
	}

	public static void main(String[] args)
	{
		DivisionByTen obj = new DivisionByTen();
		obj.check();
		// TODO Auto-generated method stub

	}

}
