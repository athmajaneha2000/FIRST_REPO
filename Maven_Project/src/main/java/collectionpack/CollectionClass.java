package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class CollectionClass 
{
    public static void main(String[] args) 
	{
		List<String> l= new ArrayList<String>();
		System.out.println(l);
		//add method
		l.add("red");
		l.add("black");
		l.add("white");
		l.add("red");
		System.out.println(l);
		
		//set method - to set new element in the collection
		l.set(1,"green");
		System.out.println(l);
		
		//indexOf() to return the index of the element
		
		System.out.println(l.indexOf("green"));
		System.out.println(l.indexOf("red"));
		
		//LastIndexOf()
		System.out.println(l.lastIndexOf("red"));
		
		//contains to check the element is present in collection or not
		System.out.println(l.contains("white"));
		System.out.println(l.contains("blue"));
		
		//isEmpty() to chech the element in the collection is empty or not
		System.out.println(l.isEmpty());
		
		//remove
		System.out.println(l.remove(1));
		System.out.println(l);
		
		//get - to get the element from the particular index 
		System.out.println(l.get(1));
		
		//size
		System.out.println(l.size());
		
		for(int i=0;i<3;i++)
		{
			System.out.println(l.get(i)); 
		}
		for(String a:l)
		{
			System.out.println(a);
		}
		// TODO Auto-generated method stub

	}

}
