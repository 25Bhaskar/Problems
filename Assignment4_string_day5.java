import java.util.Scanner;

//JAVA 11-02-2022 ASSIGNMENT 4_DAY5
/*
 * Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the 
 * outside and the longer string on the inside.
 * The strings will not be the same length, but they may be empty (length 0).
 * If input is "hi" and "hello", then output will be "hihellohi".
 */
public class Assignment4_string_day5 {

	public static String concat(String s1,String s2,int sz1, int sz2)
	{
		String newstr;
		if (sz1 < sz2)
		{
			newstr=s1+s2+s1;
			return newstr;
		}
		else
		{
			newstr=s2+s1+s2;
			return newstr;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str1=sc.nextLine();
		int size1=str1.length();
		
		System.out.print("Enter string 2: ");
		String str2=sc.nextLine();
		int size2=str2.length();
		
		System.out.println(concat(str1,str2,size1,size2));
		
	}

}
