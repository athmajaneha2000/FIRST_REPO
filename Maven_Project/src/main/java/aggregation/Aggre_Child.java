package aggregation;

public class Aggre_Child
{
	String subject;
	int mark;
    Aggre_Parent ref;
	public Aggre_Child(String subject,int mark,Aggre_Parent ref)
	{
		this.subject = subject;
		this.mark = mark;
		this.ref=ref;
				
	}
	
	public void display()
	{
		System.out.println("the subject is" +" "+subject);
		System.out.println("the mark is" +" "+mark);
		System.out.println(" the name is"+" "+ref.name);
		System.out.println("the age is"+" "+ref.age);
	}
	public static void main(String[] args) 
	{
		Aggre_Parent obj2 = new Aggre_Parent("neha",21);
		Aggre_Child obj1 = new Aggre_Child("maths",75,obj2);
		
		obj1.display();
		
		
		// TODO Auto-generated method stub

	}

}
