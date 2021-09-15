import java.util.Scanner;
interface intf
{
  	public void area();
  	public void perimeter();
}
class circle implements intf
{
  	int r;
  	float a,p;
   	public void area()
  	{
   		Scanner sc=new Scanner(System.in);
   		System.out.println("Enter the radius of the circle: ");
   		r=sc.nextInt();
   		a=3.14f*r*r;
   	}
   	public void perimeter()
   	{
     		p=2*3.14f*r ;
     		System.out.println("Perimeter of the circle is: "+p);
      		System.out.println("Area of the circle is: "+a);
	}

}
class rectangle implements intf	
{
    	int l,b;
    	float a,p;
        public void area()
    	{
    		Scanner sc=new Scanner(System.in);
     		System.out.println("Enter the length of the rectangle: ");
    		l=sc.nextInt();
    		System.out.println("Enter the breadth of the rectangle: ");
    		b=sc.nextInt();
    		a=l*b;
    	}
    	public void perimeter()
    	{
        	p=2*l*b;
        	System.out.println("Perimeter of rectangle is: "+p);
        	System.out.println("Area of Rectangle is: "+a);
    	}
}
class menudriven
{
    	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("\n.............MENU.............");
        	System.out.println("\n\t 1. Circle\n\t 2. Rectangle\n\t 3. Exit");
        	System.out.println("Enter your choice: ");
        	int ch=sc.nextInt();
        	switch(ch) 
		{
            		case 1:intf i1=new circle();
            		i1.area();
            		i1.perimeter(); 
            		break;
            		case 2:intf i2=new rectangle();
            		i2.area();
            		i2.perimeter(); 
            		break;
			case 3:System.exit(0);
            		default:System.out.println("...Enter valid choice...");
			break;
        	}
	}
}