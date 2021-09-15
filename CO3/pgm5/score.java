import java.util.*;
interface Student
{
	void AD(String name,int rollno,float m1,float m2,float percent);
}
interface Sports
{
	void SD(String item,int rank);
}
class Results implements Student, Sports
{
 	String name,item;
 	int rollno,rank;
 	float m1,m2,percent;
	public void AD(String name,int rollno,float m1,float m2,float percent)
 	{
  		this.name=name;
   		this.rollno=rollno;
   		this.m1=m1;
   		this.m2=m2;  
   		this.percent=percent;
 	}
  	public void SD(String item,int rank)
 	{
  		this.item=item;
  		this.rank=rank;
   	}
 	void display()
 	{
   		System.out.println(".............ACADEMIC DATA.............");
   		System.out.println("Name: " +name);
   		System.out.println("RollNo: " +rollno);
   		System.out.println("Mark 1: " +m1);
   		System.out.println("Mark 2: " +m2);
  		System.out.println("Percentage: " +percent);
   		System.out.println(".............SPORTS DATA.............");
   		System.out.println("Item: " +item);
   		System.out.println("Rank: " +rank);
 	}
}
class score
{
  	public static void main(String[] args)
	{
  		Scanner  sc=new Scanner(System.in);
  		Results r=new Results();
   		System.out.println("Enter the name: ");
   		String name=sc.next();
   		System.out.println("Enter the rollno: ");
   		int rollno=sc.nextInt();
   		System.out.println("Enter the mark1: ");
   		float m1=sc.nextFloat();
   		System.out.println("Enter the mark2: ");
   		float m2=sc.nextFloat();
   		float percent=((m1+m2)/200)*100f;
   		System.out.println("Enter the item: ");
   		String item=sc.next();
   		System.out.println("Enter the rank: ");
   		int rank=sc.nextInt();
		r.AD(name,rollno,m1,m2,percent);
  		r.SD(item,rank);
  		r.display();
	}
}