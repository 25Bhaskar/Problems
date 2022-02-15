//Java 09-02-2022
//Write a program to print first 5 values which are divisible by 2, 3, and..(say 5)
public class Assignment3_day3 {

	public static void main(String[] args) {
	int count=0;
	for (int i=1;i<=i+1;i++) {
		if ((i%2==0) && (i%3==0) && (i%5==0)) {
			System.out.print(i+" ");
			count++;
			if (count==5) {
				break;
			}
		}
	}
}
}
