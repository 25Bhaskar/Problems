import java.util.Scanner;

//Java 11-02-2022 Assignment 8 day 5
/*
 * Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.
 * You may assume that n is between 0 and the length of the string, inclusive.
 * Example(1)
 * i/p:Wipro,3
 * o/p:propropro
 */
public class Assignment8_day5_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int size=str.length();
		
		String str1=str.substring(size-n,size);
		for (int i=0;i<n;i++)
		{
		System.out.print(str1);
		}
		
	}

}
