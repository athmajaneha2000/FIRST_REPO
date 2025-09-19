package inheritance_package;

public class Hierarcial_Child2 extends Hierarcial_Parent
{
public void mult(int d,int e)
{
int f = d*e;
System.out.println(f);
}
	public static void main(String[] args)
	{
		Hierarcial_Child2 obj1 = new Hierarcial_Child2();
		obj1.mult(1, 3);
		obj1.diff(2, 5);
		System.out.println((obj1.r));
		
		// TODO Auto-generated method stub

	}

}
