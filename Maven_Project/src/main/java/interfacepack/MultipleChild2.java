package interfacepack;

public class MultipleChild2 implements MultipleParent1,MultipleParent2
{
	

	public static void main(String[] args) 
	{
		MultipleChild2 obj1 = new MultipleChild2();
		obj1.display();
		obj1.sum();
		
		// TODO Auto-generated method stub

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
	public void display() 
	{
		System.out.println("this is  abstract method");
		// TODO Auto-generated method stub
		
	}

}
