package accessspecifier;

public class Accessspecifier2 extends Accessspecifier1
{

	public static void main(String[] args)
	{
		Accessspecifier2 obj1 = new Accessspecifier2();
		obj1.pubmethod();
		obj1.defmethod();
		obj1.protectmethod();
		//obj1.primemethod(); private method cannot be accessed from outside the class
		
		// TODO Auto-generated method stub

	}

}
