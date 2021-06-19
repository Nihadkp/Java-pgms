import java.util.*;
public class arrayodd
{
	public static void main(String[] Args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int [10];
		System.out.print("Enter the array limit");
		int l=sc.nextInt();
		System.out.print("Enter the elements");
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("array elements are"+a);
		System.out.print("\n ");
		System.out.print("Numbers in odd position are ;");
		System.out.print("\n");




		for(int i=0;i<l;i++)
		{
			if(i%2!=0)
			{
			System.out.println(a[i]);
			}
		}
	}
}