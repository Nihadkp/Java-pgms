import java.lang.reflect.Array;
import java.util.*;
class stringarray
{
	int limit;
    	String[] str;
	stringarray(int limit)
	{
        	this.limit = limit;
        	str = new String[limit];
    	}
	void CreateArray(Scanner read)
	{
        	System.out.println("Enter the elements : ");
        	for (int i=0; i<limit; i++)
        	{
           		 str[i] = read.nextLine();
        	}
    	}
	void SortString()
	{
        	Arrays.sort(str);
        	System.out.print(Arrays.toString(str)+"\n");
    	}
}
public class sortstring
{
    	public static void main(String[] args)
	{
        	int limit;
        	Scanner read = new Scanner(System.in);
        	System.out.print("Enter the limit:");
        	limit = read.nextInt();
        	read.nextLine();
        	stringarray sa = new stringarray(limit);
        	sa.CreateArray(read);
        	sa.SortString();
    	}
}