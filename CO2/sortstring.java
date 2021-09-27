
import java.util.Arrays;
import java.util.Scanner;
class sort
{
    	String str;
    	sort(String string)
    	{
        	str=string;
    	}
    	void sorted()
    	{
    		char[] arr = str.toCharArray();
    		Arrays.sort(arr);
    		String str1 = new String(arr);
    		System.out.println(str1);
    	}
}
public class main
{
   	public static void main(String[] args) 
	{
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter the string : ");
    		String string = sc.next();
    		sort obj=new sort(string);
    		obj.sorted();
   	}
}
