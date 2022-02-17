package COLLECTIONS;
import java.util.*;
public class Map {
	public static void main(String[] args) {
		//Map ob=new HashMap();               //random order print
	    LinkedHashMap ob=new LinkedHashMap(); //insertion order print
	    // Map ob=new TreeMap();               //sorted order
	    ob.put(80,"a");
	    ob.put(20,"b");
	    ob.put(30,"c");
	    ob.put(10,null);
	    //ob.put(10,"hfdkjf");
	    
	    Set s=ob.entrySet();
	    Iterator it=s.iterator();
	    while(it.hasNext())
	    {
	      System.out.println(it.next());
	    }
	    
	    
	}
}
