//JAVA DATE 07-02-2022
//Program 1 :  Check given number is positive negative or zero 

import java.util.Scanner;
public class Assignment1_day1 {
	public static void main(String[] args) 
	{
		   Scanner sc=new Scanner(System.in);   
		   System.out.println("Enter number (P/N/ZERO) : ");
		   int a=sc.nextInt();
		   if (a>0) {
			   System.out.println(a+" is positive number");
		   }else if (a<0){
			   System.out.println(a+" is negative number");
		   }else {
			   System.out.println(a+" is Zero");
		   }
	}
}
