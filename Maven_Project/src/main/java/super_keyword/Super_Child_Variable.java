package super_keyword;

public class Super_Child_Variable extends Super_Parent_Variable
{
  String s = "Black";
  
	  public void display()
	  {
		  System.out.println(s);
		 System.out.println((super.s));
	  }
  
	public static void main(String[] args)
	{
		Super_Child_Variable obj = new Super_Child_Variable ();
		System.out.println((obj.s));
		
		obj.display();
		// TODO Auto-generated method stub

	}

}
