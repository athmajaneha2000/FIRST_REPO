package abstraction;

public class Contractor extends Employee
{
	int rate;
	double hours;
	public Contractor(int rate,double hours)
	{
		this.rate=rate;
		this.hours=hours;
	}
	public void calculateSalary()
	{
		double salary=rate*hours;
		System.out.println(salary);
	}
	
	

}
