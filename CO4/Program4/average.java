import java.util.*;
class negative extends Exception
{
	negative (String s)
	{
    		super(s);
	}
}
class average
{
    	public static void main(String args[]) 
	{
        	Scanner sc=new Scanner(System.in);
        	float avg;
        	int sum=0;
        	int num;
        	System.out.println("Enter the limit: ");
        	int l=sc.nextInt();
        	try
		{             
            		System.out.println("Enter the elements: ");
            		for(int i=0;i<l;i++)
            		{
                		num=sc.nextInt();
                		if(num < 0)
                		{
                    			throw new negative("ENTER A POSITIVE NUMBER!");
                		}
                		else
                		{
                    			sum=sum+num;
                		}
            		}
            		avg=(float)sum/l;
            		System.out.println("sum:"+sum);
            		System.out.println("avarage of "+l+ " number is :"+avg);
        	}
        	catch(negative e)
		{
            		System.out.println(e);
        	}
        	finally
		{
          		System.out.println("\n \n....THE END....");
		}

    	}
}