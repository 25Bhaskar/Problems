

//java 11-02-2022 day 5 :
/*
 * Write a java program that will return the first half of the string, 
 * if the length of the string is even. It should return null for odd length string.
 * Example(1)
 * i/p:TomCat
 * o/p:Tom
 * Example(2)
 * i/p:Apron
 * o/p:null
 */
import java.util.Scanner;
public class Assignment2_string_day5 {
	
	public static String halfstring(String str,int size)
	{
		StringBuilder S=new StringBuilder(" ");
		if (size%2==0)
		{
			for(int i=0;i<size/2;i++)
			{
				S.insert(i,str.charAt(i));
			}
		}
		else
			return null;
		return S.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		int size=str.length();
		String S=halfstring(str,size);
		System.out.println(S);
	}

}
