//JAVA 10-02-2022 Assignment 9 (DAY 4)
//concatenate 2 strings and return results in lower case only 
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Assignment9_day4 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		char[] s=sc.nextLine().toLowerCase().toCharArray();
		char[] b;
		int j=0;
		int size=s.length;
		HashSet<Character> s1 = new LinkedHashSet<>(size - 1);
		for(char i: s)
		{ 
			if (i==',')
			{
				continue;
			}else
			{
				s1.add(i);
			}
		}
		 for (char x : s1)
	            System.out.print(x);
	}
}

	