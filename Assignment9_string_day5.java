import java.util.Scanner;
//Java 11-02-2022 Assignment 9 day 5
/*
 * Given two strings a and b, return a new string, following the rules given below.
If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.
Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.
Example1)
i/p:abcXY123XYijk,XY
o/p:c13i
Example2)
i/p:XY123XY,XY
o/p:13
Example3)
i/p:XY1XY,XY
o/p:11

 */
public class Assignment9_string_day5 {

	public static String xyprint(String str1,String str2,int sz1,int sz2) 
	{
		
		StringBuilder Sb=new StringBuilder("");
		for(int i=0;i<sz1;i++)
		{
			if (str1.charAt(i)==str2.charAt(0))
			{
				if (i==0)
					;
				else
					Sb.append(str1.charAt(i-1));
				if (i==sz1-2)
					;
				else
					Sb.append(str1.charAt(i+sz2));
			}
				
		}
		return Sb.toString();
	} 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str1=sc.nextLine();
		int size1=str1.length();
		
		System.out.print("Enter string 2: ");
		String str2=sc.nextLine();
		int size2=str2.length();
		
		System.out.println(xyprint(str1,str2,size1,size2));
	}

}
