package Graphics;
interface intf_graphics
{
	public void rectarea(int l, int b);
    	public void trianglearea(int b, int h);
	public void squarearea(int a);
	public void circlearea(int r);
    	
    	
}
public class Graphics implements intf_graphics 
{
    	public void  rectarea(int l, int b)
	{
        	System.out.println("Area of Rectangle : "+l*b) ;
    	}
	public void trianglearea(int b, int h)
	{
        	System.out.println("Area of Triangle : "+(b*h)/2);
    	}
    	public void squarearea(int a)
	{
        	System.out.println("Area of Square : "+a*a);
    	}
	public void circlearea(int r)
	{
        	System.out.println("Area of Circle : "+3.14*r*r);
    	}	
}