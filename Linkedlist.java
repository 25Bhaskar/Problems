package COLLECTIONS;
import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		List <String> list=new LinkedList<>(); //GENERIC : specific type of data we can add in a list here
		list.add("hello");
		list.add("bhaskar");
		list.add("null");
		
		//way to get a data stored
		Iterator <String>it=list.iterator();
		 while(it.hasNext())
		 System.out.println(it.next());
	}

}
