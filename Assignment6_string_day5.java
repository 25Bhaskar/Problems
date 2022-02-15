import java.util.Scanner;

//JAVA 11-02-2022 DAY 5, ASSIGNMENT 6

/*Write a Java program that accepts a string (with * in it). 
 *The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of
  '*'
Example1)
i/p:ab*cd

o/p:ad
*/
public class Assignment6_string_day5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=sc.nextLine();
		int size=str.length();
		StringBuilder Sb=new StringBuilder(str);
		
		//in between if '*' exist
		for (int i=0;i<size;i++)
		{
			if (str.charAt(i)=='*') 
			{
				Sb.delete(i-1,i+2);
				
			}
		}
		System.out.println(Sb);
	}

}
