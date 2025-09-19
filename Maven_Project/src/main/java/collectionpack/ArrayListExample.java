package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("red");
		a.add("blue");
		a.add("green");
		
		System.out.println(a);
		
		ArrayList<String> b=new ArrayList<String>();
		b.add("apple");
		b.add("orange");
		b.add("grapes");
		
	    System.out.println(b);
	    
	    //addAll - to add one list to another list
	    System.out.println(a.addAll(b));
	    System.out.println(a);
	    System.out.println(b);
	    
	    //containsAll - to check whether one collection is present in another collection
	    System.out.println(a.containsAll(b));
	    System.out.println(b.containsAll(a));
		
	    Iterator <String> i = a.iterator();
	    while(i.hasNext())                 //hasNext
	    {
	    	System.out.println(i.next());  //next
	    }
	    i.remove();           //remove
	    System.out.println(a);
	    
	    // TODO Auto-generated method stub
		}

}
