import java.util.Scanner;
public class Assignment3_14feb {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array :");
		int size=sc.nextInt();
		int [] array=new int[size];
		
		try
		{
			System.out.println("Enter array Elements :");
			for (int i=0;i<size;i++)
			{
				array[i]=Integer.parseInt(sc.next());
			}
			
			System.out.println("Enter the index you want to access :");
			String Str=sc.next();
			int num=Integer.parseInt(Str);
			System.out.println("The array element at index "+num+" : "+ array[num]);
			System.out.println("The array element successfully accessed");
			
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException N)
		{
			
			System.out.println(N);
			
		}
	}
}
