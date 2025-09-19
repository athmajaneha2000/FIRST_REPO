package aggregation;

public class Aggre_StudentDetails_Child
{
	String address;
	Aggre_StudentDetails_Parent ref;
	public Aggre_StudentDetails_Child(String address,Aggre_StudentDetails_Parent ref)
	{
	 
	 this.address=address;
	 this.ref=ref;
	}
	public void display()
	{
		System.out.println("The address of the student is"+" "+address);
		System.out.println("The name of the student is"+" "+ref.name);
		System.out.println("The roll number of student is"+" " +ref.number);
		
	}

	public static void main(String[] args) 
	{
		Aggre_StudentDetails_Parent obj2 = new Aggre_StudentDetails_Parent("Neha",12);
		Aggre_StudentDetails_Child obj1 = new Aggre_StudentDetails_Child("AATHMASAROVARAM HOUSE, CHENGANNOR, P.O ALAPPUZHA",obj2);
		
		obj1.display();
		
		
		// TODO Auto-generated method stub

	}

}
