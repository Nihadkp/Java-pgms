import java.util.Scanner;
class employee
{
	int empid,salary;
	String Name;
	String Address;
	employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee ID: ");
		empid=sc.nextInt();
		System.out.println("Enter Name:");
		Name=sc.next();
		System.out.println("Enter Salary: ");
		salary=sc.nextInt();
		System.out.println("Enter Address: ");
		Address=sc.next();
	}
}
class teacher extends employee
{
	String department,subject;
	teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department name: ");
		department=sc.next();
		System.out.println("Enter subjects: ");
		subject=sc.next();
	}
	void display()
	{
		System.out.println("\n");
		System.out.println("Employee ID: "+super.empid);
		System.out.println("Name: "+super.Name);
		System.out.println("Salary: "+super.salary);
		System.out.println("Address: "+super.salary);
		System.out.println("Department: "+department);
		System.out.println("Subject: "+subject);
		
	}
}
public class ndetails
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of teachers; ");
		n=sc.nextInt();
		teacher det[]=new teacher[n];
		for(int i=0;i<n;i++)
		{	
			det[i]=new teacher();
		}
		for(int i=0;i<n;i++)
		{
			det[i].display();
		}
	}
}		