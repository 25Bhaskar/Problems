package COLLECTIONS;
import java.util.*;
public class set {
		  public static void main(String a[])
	  {

	    // Set <Integer> ob=new HashSet<>();           // print in a random fashion
	    // Set <Integer> ob=new LinkedHashSet<>();     //print in a insertion order (the way to add the data)
	    Set <Integer> ob=new TreeSet<>();              //print in sorted order
	    ob.add(1);
	    ob.add(909);
	    ob.add(93);
	    boolean c=ob.add(4);   //if 4 is repeat then show true 
	    System.out.println(c);
	    ob.add(5);
	    ob.add(6);
	    boolean b=ob.add(4);
	    System.out.println(b);
	    

	//    Enumeration e =  ob.elements();
	//    while(e.hasMoreElements()) {
	//      System.out.println(e.nextElement());
	    
	    Iterator it=ob.iterator();
	    while(it.hasNext())
	    {
	      System.out.println(it.next());
	    }
	    
	    
	  }
}
