package inheritance_package;

public class SalaryCalculator extends Allowance
{
	double totalSalary;
	
    public SalaryCalculator(double basicpay,double deduction,double bonus)
    {
    	super(basicpay,deduction,bonus);
    	
    	totalSalary = basicpay + hra - pf - deduction + bonus;
    }

}
