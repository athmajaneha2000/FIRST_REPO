package super_keyword;

public class Super_Child_Method extends Super_Parent_Method
{
	
public void display()

{
	super.sum(1, 2);
	System.out.println("child class method");
	//System.out.println((super.mult(5, 6)));
	this.show();
}
public void show()
{
	System.out.println((super.mult(5, 6)));
	System.out.println("this is parent");
}
	public static void main(String[] args) 
	{
		Super_Child_Method obj = new Super_Child_Method();
		obj.display();
		//obj.sum(2, 4);
		
		
		// TODO Auto-generated method stub

	}

}
