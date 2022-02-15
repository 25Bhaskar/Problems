//Java 09-02-2022
//Write a program to initialize an integer array and find the maximum and minimum value of the array.

public class Assignment5_day3 {

	public static void main(String[] args) {
		int[] array=new int[] {19,2,39,4,5,6,7,8,9,10};   //max=39 : min=2
		
		int size=array.length,max=0,min=array[0];
		
		for (int i=0;i<size;i++) {
			if (max < array[i]) {
				max=array[i];
			}
			if (min > array[i]) {
				min=array[i];
			}
		
		}
		System.out.println("Maximum Value = "+ max + " Minimum Value = "+ min);
		

	}

}
