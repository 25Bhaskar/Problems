import java.util.Scanner;
//JAVA 11-02-2022 Assignment 5_day5
/*
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.
 * If the input is "xHix", then output is "Hi".
 * If the input is "America", then the output is "America".
 */
public class Assignment5_string_day5 {
	public static String removeX(String s,int sz)
	{
		StringBuilder SB=new StringBuilder("");
		if (s.charAt(0) !='x')
			return s;
		if ((s.charAt(0)=='x') && (s.charAt(sz-1)=='x'))
		{
			for (int i=1;i<sz-1;i++)
				{
					SB.append(s.charAt(i));
				}
		}	
		return SB.toString();
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=sc.nextLine();	
		
		int size=str.length();
		System.out.println(removeX(str,size));
	}
}

