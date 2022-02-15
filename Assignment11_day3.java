import java.util.Scanner;
//JAVA 09-02-2022
//Write a program to print the sum of the elements of an array following the given below condition.
//If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

public class Assignment11_day3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size=sc.nextInt();
		
		int [] array=new int[size];
		System.out.println("Enter array elements :");
		for (int i=0;i<size;i++) {
			array[i]=sc.nextInt();	
		}
		
		int sum=0,i,j,i6=0,i7=0,fg=0;
		
		//Getting Index of 6 and 7 in array
		for ( i=0;i<size-1;i++) 
		{
			if (array[i]==6)
				{
					for( j=i+1;j<size;j++)
					{
						if (array[j]==7)
						{
							i6=i;
							i7=j;
							fg=1; //kind of flag whenever this condition occurs
							break;
						}
					}
					break;
				}
		}

		//displaying
		for (i=0;i<size;i++)
		{
			if (fg == 1) 
			{
				if ((i<i6) || (i>i7))
				{
					sum+=array[i];
				}
				else
					continue;
				}
			else 
			{
				sum+=array[i];
			}
		}
		
		System.out.print(sum+" ");
	}

}
