//Java 09-02-2022
//Write a program to initialize an array and print them in a sorted order.
public class Assignment9_day3 {
	
	public static void main(String[] args) {
		int[] array=new int[] {19,2,39,4,5,6,7,8,9,10};
		int size=array.length,temp=0;
					
		for (int i=0;i<size;i++)
		{
			for (int j=i+1;j<size;j++)
			{
				if (array[i] > array[j])
					{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					}
			}
		}
		for (int i=0;i<size;i++) {
		System.out.print(array[i]+ " ");
		}

	}

}
