package abstraction;

public class Abstract_Child2 extends Abstract_Parent1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Parent1 obj = new Abstract_Child2();
		obj.sum();
		obj.diff();
		Abstract_Child2 obj1 = new Abstract_Child2();
		obj1.mult();
		
	}

	@Override
	public void sum()
	{
		int a = 2;
		int b = 3;
		int c = a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}
	public void mult()  //we cannot access child class property by creating reference of the abstract class
	{
		int g = 5;
		int h = 6;
		int i =g*h;
		System.out.println(i);
	}

}
