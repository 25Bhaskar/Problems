package MAP_16feb;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Assignment4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		HashMap <String,Integer> ContactList=new HashMap();
		ContactList.put("Bhaskar",1001);
		ContactList.put("Meghna",1002);
		ContactList.put("Rohan",1003);
		ContactList.put("Manoj",1004);
		ContactList.put("Das",1005);

		System.out.println("Enter contact name you want to check (exist or not) :");
		String key=sc.nextLine();
		boolean k=ContactList.containsKey(key);
		if (k)
		{
			System.out.println("Contact Name Exist !");
		}else
		{
			System.out.println("Contact Name Does Not Exist !");
		}
		
		//b>
		sc.nextLine();
		System.out.println("Enter contact number you want to check (exist or not) :");
		int value=sc.nextInt();
		boolean s=ContactList.containsValue(value);
		if (s)
		{
			System.out.println("Contact Number Exist !");
		}else
		{
			System.out.println("Contact Number Does Not Exist !");
		}
		
		System.out.println("---------MAP---------");
		//c> Traversing a Map
		Set<Entry<String, Integer>> set = ContactList.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) 
		{
			Entry<String, Integer> me = it.next();
			System.out.println(me);
		}
		//for (Map.Entry<String, Integer> cl: ContactList.entrySet())
		//{
			//System.out.println(cl.getKey()+" : "+cl.getValue()+" ");
		//}	
	}
}
