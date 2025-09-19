package method_overriding;

public class OnSeason 
{
	public void discount(double amount)
	{
		double discountrate=0.40;
		double discountamount=amount*discountrate;
		double finalprice=amount-discountamount;
		System.out.println("On season final price " +finalprice );
	}

}