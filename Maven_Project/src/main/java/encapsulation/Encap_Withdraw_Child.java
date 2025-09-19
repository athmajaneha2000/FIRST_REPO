package encapsulation;

public class Encap_Withdraw_Child {

	public static void main(String[] args) 
	{
		int pin=1234;
		Encap_Withdraw_Parent obj = new Encap_Withdraw_Parent();
		obj.setPin(pin);
		if(obj.getPin())
		{
			System.out.println("VALID PIN");
		}
		else
		{
			System.out.println("INVALID PIN");
		}
		// TODO Auto-generated method stub

	}

}
