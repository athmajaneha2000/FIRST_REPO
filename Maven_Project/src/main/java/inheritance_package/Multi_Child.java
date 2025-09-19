package inheritance_package;

public class Multi_Child extends Multi_Inter
{
	public void display()
	{
		
		System.out.println("this is the child class");
	}
	

	public static void main(String[] args)
	{
		Multi_Child obj = new Multi_Child();
		obj.sum(2, 4);
		obj.difference(5, 3);
		obj.display();
		
		
		// TODO Auto-generated method stub

	}

}
