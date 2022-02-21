package MAP_16feb;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		HashMap <Integer,String> m1=new HashMap();
		m1.put(1, "string1");
		m1.put(2, "string2");
		m1.put(3, "string3");
		m1.put(4, "string4");
		m1.put(5, "string5");
		m1.put(6, "string6");
		Scanner sc=new Scanner(System.in);
		//a>
		System.out.println("Enter key you want to check (exist or not) :");
		int key=sc.nextInt();
		boolean k=m1.containsKey(key);
		if (k)
		{
			System.out.println("Key Exist !");
		}else
		{
			System.out.println("Key Does Not Exist !");
		}
		
		//b>
		sc.nextLine();
		System.out.println("Enter value you want to check (exist or not) :");
		String value=sc.nextLine();
		boolean s=m1.containsValue(value);
		if (s)
		{
			System.out.println("Value Exist !");
		}else
		{
			System.out.println("Value Does Not Exist !");
		}
		
		System.out.println("---------MAP---------");
		//c> Traversing a Map
		for (Map.Entry <Integer,String> m: m1.entrySet())
		{
			System.out.print(m.getKey()+" : "+m.getValue());
		}
		

	}

}
