//JAVA DATE 07-02-2022
// Program 2 : Check a given number is an even or an odd number
import java.util.*;
public class Assignment2_day1 {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter number (to check even or odd ) : ");
		   int b=sc.nextInt();
		   if (b%2==0)
		   {
			   System.out.println(b+" is EVEN number");
		   }else {
			   System.out.println(b+" is ODD number");
		   }
		   
	}

}
