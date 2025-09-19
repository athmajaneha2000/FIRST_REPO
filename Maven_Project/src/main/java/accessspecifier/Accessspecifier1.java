package accessspecifier;

public class Accessspecifier1
{
	public void pubmethod()
	{
	 System.out.println("This is a public method");
	}
	private void primemethod()
	{
		System.out.println("This is private method");
	}
	  void defmethod()
	  {
		  System.out.println("this is defmethod");
	  }
	  protected void protectmethod()
	  {
		  System.out.println("this is protect method");
	  }

	public static void main(String[] args)
	{
		Accessspecifier1 obj = new Accessspecifier1();
		obj.pubmethod();
		obj.primemethod();
		obj.defmethod();
		obj.protectmethod();
		// TODO Auto-generated method stub

	}

}
