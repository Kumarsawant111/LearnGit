package Exception_Handling_Assignment;

import java.util.Scanner;

/*Q 4 Create a class Student with attributes roll no, name, age and
course. Initialize values through parameterized constructor. If age of
student is not in between 15 and 21 then generate user-defined exception
“AgeNotWithinRangeException”. If name contains numbers or special
symbols raise exception” NameNotValidException ”.
 */
class AgeOrName extends Exception // uerdefined class;
{
	AgeOrName() // non parameterized constructor;
	{
		System.out.println("AgeNotWithinRangeException");
	}
    AgeOrName(int a)//parameterized constructor;
    {
    	System.out.println("NameNotValidException");
    }

}

public class Student { // class student 
	String name, course;
	int rollno, age;
	Student(String n, String c, int r, int a ) // parameterized constructor;
	{
		name =n; course =c; rollno=r; age=a;
		
		try
		{
			try
			{
				if(a>15 && a<21) throw new AgeOrName();
			}
			catch(AgeOrName o)
			{
				System.out.println(o);
			}
            try
            {
            	boolean flag =true;
            	for(int i=0; i<n.length(); i++)
            	{
            		if(n.charAt(i)>33 && n.charAt(i)<64)
            		{
            			flag =false;
            		}
            	}
       if(flag==false) throw new AgeOrName(1);
       else
    	   System.out.println("Name is Valid");
            }
           catch(AgeOrName t)
            {
        	   System.out.println(t);
            }
	
		}
		finally
		{
			System.out.println("Thats it !");
		}
		
	}

	public static void main(String[] args) {
        
		Scanner s = new Scanner(System.in);
		int r, a;
		String n,c;
		System.out.println("Enter Name :");
		n = s.next();
		System.out.println("Enter RollNo :");
		r = s.nextInt();
		System.out.println("Enter Age :");
		a = s.nextInt();
		System.out.println("Enter Course :");
		c = s.next();
		//new Student(r,a,n,c);

	}

}
