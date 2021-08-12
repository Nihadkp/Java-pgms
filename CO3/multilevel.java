import java.util.Scanner;
class person
{
	String name,gender,address;
	int age;
	person()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		name=sc.next();
		System.out.println("Enter Gender: ");
		gender=sc.next();
		System.out.println("Enter Address: ");
		address=sc.next();
		System.out.println("Enter Age: ");
		age=sc.nextInt();
	}
}
class Employee extends person
{
	int empid,salary;
	String company_name,qualification;
	Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmpID: ");
		empid=sc.nextInt();
		System.out.println("Enter Salary: ");
		salary=sc.nextInt();
		System.out.println("Enter company_name: ");
		company_name=sc.next();
		System.out.println("Enter Qualification: ");
		qualification=sc.next();
	}
}
class Teacher extends Employee
{
	String subject,department;
	int teacherid;
	Teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Subject: ");
		subject=sc.next();
		System.out.println("Enter Department: ");
		department=sc.next();
		System.out.println("Enter TeacherID: ");
		teacherid=sc.nextInt();
	}
	void display()
	{
		System.out.println("\n");
		System.out.println("Name: "+super.name);
		System.out.println("Gender: "+super.gender);
		System.out.println("Age: "+super.age);
		System.out.println("Address: "+super.address);
		System.out.println("EmpID: "+super.empid);
		System.out.println("Company name: "+super.company_name);
		System.out.println("Qualification: "+super.qualification);
		System.out.println("Salary: "+super.salary);
		System.out.println("Subject: "+subject);
		System.out.println("TeacherID: "+teacherid);
		System.out.println("Department: "+department);
	}
}
class multilevel
{
   	public static void main(String args[]) 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the number of Teacher : ");
        	int size=sc.nextInt();
        	Teacher det[]=new Teacher[size];
        	for (int i=0;i<size;i++)
        	{
            		det[i]=new Teacher();
        	}
        	for(int i=0;i<size;i++)
        	{
            		det[i].display();
        	}
	}
}