import java.util.Scanner;

//JAVA 11-02-2022 Assignment 3_day5
/*Write a java program that accepts a string and returns a new string without the first and last character of the input string.
i/p:Suman
o/p:uma
*/
public class Assignment3_string_day5 {
	public static String firstlast(String str, int size)
	{
		StringBuilder S=new StringBuilder(str);
		S.delete(0,1);
		S.delete(size-1,size);	
		return S.toString();
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		int size=str.length();
		String S=firstlast(str,size-1);
		System.out.println(S);
	}

}
