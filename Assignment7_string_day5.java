import java.util.Scanner;

//java 11-02-2022 Assignment 7 day 5;
/*
 * Given two strings, a and b, print a new string which is made of the following combination-first character of a, 
 * the first character of b, second character of a, second character of b and so on.
 * Any characters left, will go to the end of the result.
 * Example(1)
i/p:Hello,World

o/p:HWeolrllod
 */
public class Assignment7_string_day5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str1=sc.nextLine();
		int size1=str1.length();
		
		System.out.print("Enter string 2: ");
		String str2=sc.nextLine();
		int size2=str2.length();
		int j=0,k=0;
		StringBuilder Sb=new StringBuilder(" "); 
		
		for (int i=0;i<(size1+size2);i++)
		{
			if (i%2 ==0 )
			{
				Sb.append(str1.charAt(j));
				j++;
			}
			else 
			{
				Sb.append(str2.charAt(k));
				k++;
			}
		}
		System.out.println(Sb);
	}

}
