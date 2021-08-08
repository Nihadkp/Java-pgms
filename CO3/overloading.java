class pgrm
{
	int l,b,len;
	void rect(int l,int b)
	{
		System.out.println("Area of rectangle :"+l*b);
	}
	void sq(int len)
	{
		System.out.println("Area of square :"+len*len);
	}
}
public class overloading
{
	public static void main(String Args[])
	{
		pgrm p=new pgrm();
		p.rect(7,8);
		p.sq(6);
	}
}	