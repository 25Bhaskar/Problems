package MAP_16feb;

import java.util.HashMap;
import java.util.Map;

public class MAPoperations {
	public static void main(String[] args) {
		HashMap <Integer,String> m1=new HashMap();
		m1.put(1, "Lakshay");
		m1.put(2, "manoj");
		m1.put(3, "Bhaskar");
		
		for (Map.Entry <Integer,String> m: m1.entrySet())
		{
		System.out.println(m.getKey()+" : "+m.getValue());
		}
		boolean i=m1.containsKey(1);
		boolean j=m1.containsValue("Bhas");
		System.out.print(i+" "+j);

	}

}
