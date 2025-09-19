package interfacepack;

public class InterfaceChild1 implements InterfaceParent1
{
	
	
	
	public static void main(String[] args) 
	{
		InterfaceParent1 obj1 = new InterfaceChild1();
		obj1.sum();
		// TODO Auto-generated method stub
     
	}

	@Override
	public void sum() 
	{
		int a = 3;
		int b = 5;
		int c = a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
