package abstraction;

public class Abstract_Child extends Abstract_Parent 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Child obj1 = new Abstract_Child();
		obj1.sum();
		System.out.println(obj1.diff());
	}

	@Override
	public void sum() 
	{
		int a = 1;
		int b = 2;
		int c = a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public int diff() 
	{
		int d = 5;
		int e = 3;
		int f =d-e;
		return f;
	}
		// TODO Auto-generated method stub

	}
	
	

