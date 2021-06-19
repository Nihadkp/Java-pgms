import java.util.*;
public class arrayeven
{
	public static void main(String[] Args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		System.out.print("\n Enter the limit");
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
		System.out.print("\nNumbers in even position are : ");
		for(int i=2;i<l;i++)
		{
			if(i%2==0)
			System.out.print(a[i]+" , ");
		}
	}
}