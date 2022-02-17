package COLLECTIONS;

import java.util.*;
public class operations_on_array {
	public static void main(String a[])
	{
	  int s[]={10,9,2,3,5,99};
	  for(int i=0;i<s.length;i++)
	  {
	    System.out.println(s[i]);
	  }
	  Arrays.sort(s);                  //predefined sort 
	  System.out.println("after sorting");
	  for(int o:s)
	  {
	    System.out.println(o);
	  }
	  int i=Arrays.binarySearch(s,9);   //predefined binary search 
	  System.out.println("index value= "+i);
	  
	  
	  
	}
}
