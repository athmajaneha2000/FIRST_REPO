package method_overriding;

public class Discount {

	public static void main(String[] args) 
	{
		OnSeason obj1 = new OnSeason();
		obj1.discount(1000);
		OffSeason obj2 = new OffSeason();
		obj2.discount(1000);
		
		// TODO Auto-generated method stub

	}

}
