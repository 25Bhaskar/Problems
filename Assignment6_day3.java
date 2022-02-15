import java.util.Scanner;

//Java 09-02-2022
/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.
If the number is not found, it will print -1 else it will print the index value of the given number in the array.
*/
public class Assignment6_day3 {

	public static void main(String[] args) {
		int[] array=new int[] {19,2,39,4,5,6,7,8,9,10};
		int size=array.length,c=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to search : ");
		int num=sc.nextInt();
		
		//Linear Search
		for (int i=0;i<size;i++) {
			if (array[i]==num) {
				c=i;
				break;
			}else
				c=0;
		}
		if (c !=0)
			System.out.println(c);
		else
			System.out.println("-1");
			
	}

}
