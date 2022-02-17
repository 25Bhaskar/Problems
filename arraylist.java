package COLLECTIONS;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.*;
import java.util.List;

public class arraylist 
{
	public static void main(String[] args) 
	{
		List <String>list=new ArrayList<>(); //generic to string only
 		list.add("hello");
		list.add("how");
		list.add("ssss");
		list.add("G");
		list.add("null");
		list.add("show");
			 
//      Way 1 to get the data stored in a list
//   	System.out.println(list.size());
//		for(int i=0;i<list.size();i++)
//  	  System.out.println(list.get(i));

			 
	    //way 2 to get the data stored in a list
			 
			 Object ob[]=list.toArray();
			 for(Object o:ob)   // enhanced for loop
			  System.out.println(o);

//way 3 to get the data stored in a list
//           Iterator it=list.iterator();
//			 while(it.hasNext())
//			 System.out.println(it.next());

	 }
}

