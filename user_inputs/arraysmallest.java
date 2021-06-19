import java.util.Scanner;
public class arraysmallest{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array:"); 
        int l= sc.nextInt();
        int[] a=new int [l];
        System.out.print("Enter elements of array:");
        System.out.print("\n");    
        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("The entered numbers are : ");
        for(int i=0;i<l;i++)
        {
                System.out.print(a[i]+" , ");
        }
		int small=a[0];
        	for(int i=1;i<l;i++)
        	{
			if(small>a[i])
           		 {
              			  small=a[i];
           		 }
     		   }
		System.out.print("\n largest number is : "+small);
	}
}