package interfacepack;

public interface Inter_Parent 
{
	public static final int a = 1;
	int b = 3;
	
		public abstract void sum();

  default void show()
  {
	  System.out.println("this is default method");
  }
  public static void display()
  {
	  System.out.println("This is static method");
  }

}
