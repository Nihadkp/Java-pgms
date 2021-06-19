import java.util.Scanner;
public class arraylargest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit:");
		int l=sc.nextInt();
		int[] a=new int[l];
		System.out.print("Enter the numbers : \n");
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.print("\n Array elements are :");
		for(int i=0;i<l;i++)
		{
			System.out.print(+a[i]+" , ");
		}
		int large=a[0];
        	for(int i=0;i<l;i++)
        	{
			if(large<a[i])
           		 {
              			  large=a[i];
           		 }
     		}
		System.out.print("\n largest number is : "+large);
	}
}