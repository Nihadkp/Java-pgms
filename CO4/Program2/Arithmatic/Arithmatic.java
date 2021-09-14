package Arithmatic;
interface intf_arithmatic
{
   	public float add(int a, int b);
	public float substract(int a, int b);
	public float multiply(int a, int b);
   	public float divide(int a, int b);
   	public float remainder(int a, int b);
}
public class Arithmatic implements intf_arithmatic
{
	public float add(int a, int b)
	{
        return a+b;
    	}
	public float substract(int a, int b)
	{
        	return a-b;
    	}
    	public float multiply(int a, int b)
	{
        	return a*b;
    	}
	public float divide(int a, int b)
	{
        return a/b;
    	}
    	public float remainder(int a, int b)
	{
        	return a%b;
    	}
}