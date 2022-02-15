//JAVA 10-02-2022 Assignment 8 (DAY 4) 
//String Palindrome
import java.util.Scanner;

public class Assignment8_day4_StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s=sc.nextLine();
		String rs="";
		int size=s.length();
		for (int i=size-1;i>=0;i--)
		{
			rs+=s.charAt(i);
		}
		
		if (rs.equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
