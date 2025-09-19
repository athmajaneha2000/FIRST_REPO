package method_overriding;

public class Method_Child extends Method_Parent
{
	public void sum(int a,int b)
	{
		super.sum(2, 4);
	  int c =a+b;
	  System.out.println(c);
	}
	 public int mult(int d,int e)
	 {
		 System.out.println(super.mult(5,6));
		 int f = d*e;
		 return f;
		
	 }
	public static void main(String[] args)
	{
		Method_Child obj = new Method_Child ();
		obj.sum(1,2);
		
		System.out.println(obj.mult(2, 5));
		// TODO Auto-generated method stub
 }

}
