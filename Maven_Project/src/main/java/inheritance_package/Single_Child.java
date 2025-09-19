package inheritance_package;

public class Single_Child extends Single_Parent
{
	public void difference(int c,int d)
	{
		int e = c-d;
		System.out.println(e);
	}

	public static void main(String[] args)
	{
		Single_Child obj = new Single_Child();
		obj.difference(4, 3);
		obj.sum(1, 2);
		obj.mult(2, 3);
		
		Single_Parent obj1= new Single_Parent();
		obj1.sum(1, 2);
		obj1.mult(1, 2);
		
		
		
		// TODO Auto-generated method stub

	}

}
