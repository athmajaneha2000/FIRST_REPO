package encapsulation;

public class Encap_Child1 {

	public static void main(String[] args)
	{
		Encap_Parent1 obj1 = new Encap_Parent1();
		obj1.setName("neha");
		System.out.println(obj1.getName());
		obj1.setPin(125);
		System.out.println(obj1.getPin());
		obj1.setAge(25);
		System.out.println(obj1.getAge());
		// TODO Auto-generated method stub

	}

}
