package method_overriding;

public class Overriding_Child extends Overriding_Parent
{
	

	@Override
	public void diff(int a, int b) 
	{
		// TODO Auto-generated method stub
		int c = a-b;
		System.out.println(c);
		
		super.diff(a, b);
	}

	public static void main(String[] args) 
	{
		Overriding_Child obj = new Overriding_Child();
		obj.diff(8, 6);
		// TODO Auto-generated method stub

	}

}
