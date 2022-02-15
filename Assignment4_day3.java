//Java 09-02-2022
//Write a program to initialize an integer array and print the sum and average of the array.
public class Assignment4_day3 {

	public static void main(String[] args) {
		int[] array=new int[] {1,2,3,4,5,6,7,8,9,10};
		int size=array.length,sum=0;
		float avg=0;
		for (int i=0;i<size;i++) {
			sum +=array[i];
		}
		avg=sum/size;
		System.out.println("SUM = "+ sum + " Average = "+avg);
	}

}
