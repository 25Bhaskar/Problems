//JAVA  Date 08-02-2022
//Program 4 : Write a program to print prime numbers between 10 and 99.
public class Assignment4_day2 {
	public static void main(String[] args) {
		int num1=10,num2=99,c;
		for (int i=num1+1;i<num2;i++) {
			c=0;
			for (int j=2;j<=i/2;j++) {
				if (i%j == 0) {
					c=1;
					break;
				}else
					c=0;
			}
			if (c==0)
				System.out.println(i);
		}
	}
}
