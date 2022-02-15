//JAVA 09-02-2022
//Write a Java program to find if the given number is palindrome or not
import java.util.Scanner;
public class Assignment2_day3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		int num=sc.nextInt();
		int tempnum=num,addnum=0,a=0;
		while (num >0)
		{
			a=num%10;
			addnum=(addnum*10)+a;
			num=num/10;
		}
		if ( addnum == tempnum ) 
			System.out.print(tempnum+" is a PALINDROME");
		else 
			System.out.print(tempnum+" is not a PALINDROME");	
	}
}
