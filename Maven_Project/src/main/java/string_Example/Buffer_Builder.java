package string_Example;

public class Buffer_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a = new StringBuffer("HELLO");
		System.out.println(a);
		StringBuilder b = new StringBuilder("HI");
		System.out.println(b);
		//append()
		System.out.println(a.append(b));
		System.out.println(a.append("world"));
		//insert()
		System.out.println(b.insert(2, "MORNING"));
		//replace()
		System.out.println(b.replace(2,9, " BEAUTIFUL"));
		//delete()
		System.out.println(b.delete(2, 13));
		//reverse()
		System.out.println(b.reverse());
		//charAt()
		System.out.println();
		
		
	}
	
}
