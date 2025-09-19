package abstraction;

public class Full_Time_Employee extends Contractor
{
	public  Full_Time_Employee(int rate,double hours)
	{
		super(rate,hours);
	}
   public void calculateSalary()
   {
	   int salary=rate*8;
	   System.out.println("The full time employee salary " +salary);
   }
	public static void main(String[] args)
	{
		Contractor obj2 = new Contractor(500,9);
		Full_Time_Employee obj1 = new Full_Time_Employee(450,8);
		obj1.calculateSalary();
		obj2.calculateSalary();
		  
		// TODO Auto-generated method stub

	}

}
