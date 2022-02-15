//JAVA 09-02-2022
//Write a program to reverse a given number and print
import java.util.Scanner;
public class Assignment1_day3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int a=0;
		while (num > 0)
		{
			a=num%10;
			System.out.print(a);
			num=num/10;
		}
		
	}

}
