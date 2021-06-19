import java.util.*;
public class arraylength
{
	public static void main(String[] Args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		System.out.print("\nEnter the limit : ");
		int l=sc.nextInt();
		System.out.print("\n Enter the numbers : ");
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\n The numbers are : ");
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]+" , ");
		}
		int count=0;
		while(count<l)
		{
			count=count+1;
		}
		System.out.print("\nthe count is : "+count);
	}
}