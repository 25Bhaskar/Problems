import java.util.Scanner;
//java 09-02-2022
//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

public class Assignment8_day3 {

	public static void main(String[] args) {
		int[] array=new int[] {19,2,39,4,5,6,7,8,9,10};
		int size=array.length,c=0,mx1=array[0],mx2=array[1],mi1=array[0],mi2=array[1];
		
		int temp1=0,temp2=0;
		//swapping
		if (mx2 > mx1)
		{
			temp1=mx2;
			mx2=mx1;
			mx1=temp1;
		}
		
		if (mi2 < mi1)
		{
			temp2=mi2;
			mi2=mi1;
			mi1=temp2;
		}
		
		for(int i=2;i<size;i++)
		{//Largest
			if (array[i] > mx1)
			{
				mx2=mx1;
				mx1=array[i];
			}
			else if ((array[i] > mx2) && (array[i] != mx1))
			{
				mx2=array[i];
			}
			
		//Smallest
			if (array[i] < mi1)
			{
				mi2=mi1;
				mi1=array[i];
			}
			else if ((array[i] < mi2) && (array[i] != mi1))
			{
				mi2=array[i];
			}
			
		}
		//Print
		System.out.println("Largest 1 :"+mx1 +"\n"+"Largest 2 : "+mx2 +"\n" + "Smallest 1 :"+mi1 +"\n"+"Smallest 2 : "+mi2);
	}

}


