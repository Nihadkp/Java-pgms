import Arithmatic.*;
public class operations
{
    	public static void main(String []args)
	{
        	Arithmatic obj = new Arithmatic();
        	System.out.println("sum  : "+obj.add(7,9));
        	System.out.println("Difference : "+obj.substract(9,7));
       		System.out.println("product : "+obj.multiply(7,9));
        	System.out.println("division : "+obj.divide(6,3));
        	System.out.println("remainder : "+obj.remainder(5,2));
    	}
}