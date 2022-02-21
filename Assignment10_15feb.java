import java.lang.reflect.Array;
import java.util.*;
public class Assignment10_15feb 
{
	public static void main(String[] args) 
	{
		Set <String> T=new TreeSet();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements into a Tree set :");
		for (int i=0;i<5;i++)
		{
			T.add(sc.next());
		}
		System.out.println("Original Treeset : ");
		Iterator <String> it=T.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next()+" ");
			
		}
		System.out.println(" ");
		sc.nextLine();
		System.out.println("Enter string you want to search :");
		String Str=new String(sc.nextLine());
		if (T.contains(Str))
		{
			System.out.println("YES ! Treeset contains element :"+Str);
		}
		else
		{
			System.out.println("NO ! Treeset doesnot contains element :"+Str);
		}
		
		System.out.println(" ");
		String[] arr=new String[T.size()];
		arr=T.toArray(arr);
		System.out.println("Reversed Treeset :");
		for (int i=T.size()-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
