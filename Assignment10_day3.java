//Java 09-02-2022
//Write a program to remove the duplicate elements in an array and print the same.
import java.util.Scanner;
public class Assignment10_day3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size=sc.nextInt();
		int [] array=new int[size];
		System.out.println("Enter array elements :");
		for (int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		
		
		int [] b=new int [size];
		int j=0;
		for (int i=0;i<size-1;i++) {
			if (array[i] !=array[i+1] )
				{
				b[j++]=array[i];
				}	
		}
		
		b[j++]=array[size-1];
		for (int i=0;i<j;i++)
		{
			System.out.print(b[i]+" ");
		}				
	}
}


