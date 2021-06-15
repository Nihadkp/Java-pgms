class complex
{
	int real,image;
	void add(int a,int b,int c,int d)
	{
		real=a+c;
		image=b+d;
		System.out.println("complex number is "+real+" + "+image+"i");
	}
}
public class complexadd
{
	public static void main(String[] Args)
	{
		complex c=new complex();
		c.add(3,5,6,7);
	}
}
	