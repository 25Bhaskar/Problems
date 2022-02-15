//JAVA DATE 07-02-2022
// Program 3 : To receive a color code from the user (an Alphabhet). 
// The program should then print the color name, based on the color code given. 
import java.util.*;
public class Assignment3_day1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter alphabet R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White : ");
		   char str=sc.next().charAt(0);
		   switch(str)
		   {
		   case 'R' : System.out.println("RED Colour ");   break;
		   case 'B' : System.out.println("BLUE Colour ");  break;
		   case 'G' : System.out.println("GREEN Colour "); break;
		   case 'O' : System.out.println("ORANGE Colour ");break;
		   case 'Y' : System.out.println("YELLO Colour "); break;
		   case 'W' : System.out.println("WHITE Colour "); break;
		   default : System.out.println("Invalid input "); 
		   }
		   

	}

}
