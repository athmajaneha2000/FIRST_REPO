package method_overriding;

public class OffSeason 
{
	public void discount(double amount)
	{
		double discountRate=0.15;
		double discountAmount=amount*discountRate;
		double finalPrice=amount-discountAmount;
		System.out.println("Off season final price " +finalPrice);
	}

}
