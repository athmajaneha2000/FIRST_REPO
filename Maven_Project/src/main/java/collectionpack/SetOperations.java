package collectionpack;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) 
	{
		Set<String> s = new HashSet<String>();
		s.add("red");
		s.add("green");
		s.add("blue");
		s.add("red");
		System.out.println(s);
		
		Set<String> p = new HashSet<String>();
		p.add("apple");
		p.add("orange");
		p.add("manngo");
		System.out.println(p);
		
		System.out.println(s.addAll(p));
		System.out.println(s);
		
		System.out.println(s.containsAll(p));
		System.out.println("red");
		
		System.out.println(s.isEmpty());
		s.remove("blue");
		System.out.println(s);
		
		s.clear();
		System.out.println(s);
		
		System.out.println(s.isEmpty());
		// TODO Auto-generated method stub

	}
	

}
