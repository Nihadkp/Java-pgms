import java.util.*;
public class arrayrev
{
	public static void main(String[] Args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		System.out.print("\n Enter the limit: ");
		int l=sc.nextInt();
		System.out.print("\n Enter the values:");
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\n Array elements are :");
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]+" , ");
		}
		System.out.print("\n Array in reverse order is: ");
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(a[i]+" , ");
		}
	}
}
	