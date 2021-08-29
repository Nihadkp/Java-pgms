class product
{
	int pcode;
    	String pname;
    	double price;
    	product(int pcode,String pname,double price)	
	{
    	this.pcode=pcode;
    	this.pname=pname;
    	this.price=price;    
	}
	void low(product p1,product p2,product p3) 
	{
    		if ((p1.price<p2.price) && (p1.price<p3.price))
        	{
           		System.out.println("lowest price is : "+p1.price);
        	}
        	else if ((p2.price<p1.price) && (p2.price<p3.price))
        	{
         		System.out.println("lowest price is : "+p2.price);

	        }
        	else
        	{
          		System.out.println("lowest price is : "+p3.price);
	        }
        }
}
public class lowprice
{
    	public static void main(String[] args) 
	{
        	product p1=new product(101,"laptop",50000);
        	product p2=new product(203,"pendrive",500);
        	product p3=new product(504,"keyboard",670);
        	p3.low(p1,p2,p3);
        }
}
