package interfacepack;

public class Interface_Child implements Inter_Parent 
{

	public static void main(String[] args)
	{
		Interface_Child obj1 = new Interface_Child();
		obj1.sum();
		obj1.show();
		 Inter_Parent.display();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void sum()
	{
		int c = a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
