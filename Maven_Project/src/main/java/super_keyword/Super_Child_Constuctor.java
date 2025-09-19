package super_keyword;

public class Super_Child_Constuctor extends Super_Parent_Constructor

{
	public Super_Child_Constuctor()
	
	{
		super(1,2);
		
	 System.out.println("This is child constructor");	
	}
	public Super_Child_Constuctor(int d,int e)
	     
	{
		super();
	    int f=d*e;
		System.out.println(f);
	}
	

	public static void main(String[] args) 
	{
		Super_Child_Constuctor obj = new Super_Child_Constuctor();
		Super_Child_Constuctor obj1 = new Super_Child_Constuctor(2,3);
	
		
		// TODO Auto-generated method stu}
	}
}
	