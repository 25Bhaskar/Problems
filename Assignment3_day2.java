//JAVA  Date 08-02-2022
//Program 3: Write a program to check if a given number is prime or not.
import java.util.Scanner; 

public class Assignment3_day2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int c=0;
		if (num==0 || num==1)
			c=1;
		for (int i=2;i<=num/2;i++) {
			c=0;
			if (num%i == 0) 
			{
				c=1;break;
			}else
				c=0;
		}
		if (c==1)
			System.out.println("Not Prime Number");
		else
			System.out.println("Prime Number");
		}
}


