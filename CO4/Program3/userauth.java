import java.util.*;
class unameauth extends Exception
{
    	unameauth(String s)
    	{
        	super(s);
    	}
}
class passwdauth extends Exception
{
    	passwdauth(String s)
    	{
        	super(s);
    	}	
}
class userauth
{
    	public static void main(String[] args) 
	{
        	String username,password;
           	try
		{
                	Scanner sc=new Scanner(System.in);
                	System.out.println("enter the username:");
                	username=sc.nextLine();
                	System.out.println("enter the password:");
                	password=sc.nextLine();
                	if(!username.equals("Nihad"))
                    	throw new unameauth("incorrect Username");
                	else if(!password.equals("12345"))               
                     	throw new  passwdauth("incorrect password");
                	else
                     	System.out.println("\t\t\t ......login successfull......");
                }
                catch(unameauth e)
		{
                   	System.out.println(e);
               	}
              	catch(passwdauth e)
		{
                     	System.out.println(e);
                }
                finally
		{
                     	System.out.println("\n \n ...END OF CODE...");
		}
	}
}