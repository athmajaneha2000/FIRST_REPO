package accessmodifier;

import accessspecifier.Accessspecifier1;

public class Accessmodifier1 extends Accessspecifier1{

	public static void main(String[] args) 
	{
		Accessmodifier1 obj = new Accessmodifier1();
		obj.protectmethod();
		obj.pubmethod();
		
		Accessspecifier1 obj1 = new Accessspecifier1();
		obj1.pubmethod();
		
		// TODO Auto-generated method stub

	}

}
