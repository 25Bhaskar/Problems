//Java 09-02-2022
//Initialize an integer array with ascii values and print the corresponding character values in a single row.
public class Assignment7_day3 {

	public static void main(String[] args) {
		int[] array=new int[52];
		int j=65,k=97;
		//Array Initialization
		for (int i=0;i<52;i++) {
			if (i<26) {
			array[i]=j;
			j++;
			}else {
				array[i]=k;
				k++;
			}
		}
		//Print
		for (int i=0;i<52;i++) {
			System.out.print(array[i]+" "+(char)array[i]+" ");
			}
	}
}


