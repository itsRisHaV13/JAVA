import java.util.*;

import org.jcp.xml.dsig.internal.SignerOutputStream;
class ClassName
{
    public static void main(String[]args)
    {
        
    }
}

class HelloWorld 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!"); 
    }

} 

// Your First Program

class MyFirstJavaProgram
{
    public  static void main(String[] args)
    {
        System.out.println("hello world");
        
    }
}



class A
{
    public static void main(String args[])
    {
        System.out.print("first java program");
    }
}

class mann
{
	public static void main(String [] args)
	{
		Scanner inp = new Scanner(System.in);
		System.out.print("enter number");

		int a=inp.nextInt();
		Scanner inp1 = new Scanner(System.in);
		System.out.print("enter number");
		int b=inp1.nextInt();
		int c=a+b;
		System.out.println(c);

	}
}





class SwapTwoNumbersExample1  
{  
public static void main(String args[])  
{  
int a, b;  
Scanner scanner = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
a = scanner.nextInt();  
System.out.print("Enter the second number: ");  
b = scanner.nextInt();  
System.out.println("Before swapping:");  
System.out.println("a = " +a +", b = " +b);  
a = a ^ b;  
b = a ^ b;  
a = a ^ b;  
System.out.println("After swapping:");  
System.out.print("a = " +a +", b = " +b);  
}  
}  


class LargestOfThree
{
    public static void main(String args[])
    {
        int a=5, b=4, c=8;
        System.out.print("Largest of three: ");
        if (a>b)
        {
            if (a>c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        else 
        {
            if (c>b)
            {
                System.out.println(c);
            }
            else
            {
                System.out.println(b);
            }
        }       
        
    }
}






class SmallestOfThree
{
    public static void main(String args[])
    {
        int a=8, b=24, c=34;
        System.out.println("Smalles of Three is: ");
        if (a<b)
        {
            if (a<c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        else
        {
            if (b<c)
            {
                System.out.println(b);

            }
            else
            {
                System.out.println(c);
            }
        }
    }
}

class Add2no
{
    public static void main(String[]args)
    {
        int a=2, b=3,c;
        c=a+b;
        System.out.println("Result="+c);

    }
}


class Employee
{


    public static void main(String[]args)
    {
        int empID=1234;
		String name="XYZ";
		byte age=27;
		float salary=210000.21F;
		long Contact=780278813;
		System.out.println("Name="+name);
		System.out.println("EmpID="+empID);
		System.out.println("Age="+age);
		System.out.println("Salary="+salary);
		System.out.println("Contact="+Contact);
    }

}


class Employee33
{


    public static void main(String[]args)
    {
        int empID=1234;
		String name="XYZ";
		byte age=27;
		float salary=210000.21F;
		long Contact=780278813;
		System.out.println("Name="+name+"\nEmpID="+empID+"\nAge="+age+"\nSalary="+salary+"\nContact="+Contact);
    }

}


//import java.util.*;
class UserInp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name;
		byte age;
		int empid;
		float salary;
		long contact;
		
		
		System.out.println("Enter your name: ");
		Scanner inp1=new Scanner(System.in);
		name=inp1.nextLine();
		
		System.out.println("Enter employee id: ");
		Scanner inp2=new Scanner(System.in);
		empid=inp2.nextInt();
		
		System.out.println("Enter age: ");
		Scanner inp3=new Scanner(System.in);
		age=inp3.nextByte();
		
		System.out.println("Enter salary: ");
		Scanner inp4=new Scanner(System.in);
		salary=inp4.nextFloat();
		
		System.out.println("Enter contact number: ");
		Scanner inp5=new Scanner(System.in);
		contact=inp5.nextLong();
		
		
		System.out.println("Name of employee: "+name);
		System.out.println("Employee ID: "+empid);
		System.out.println("Age of employee: "+age);
		System.out.println("Salary is: "+salary);
		System.out.println("Contact no. is: "+contact);
		
	}

}
 
class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Enter string");
		Scanner inp=new Scanner(System.in);
		String s=inp.nextLine();
		System.out.println(s);
	}
}


class ControlStatement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int ammount;
		
		System.out.println("Enter ammount: ");
		Scanner inp=new Scanner(System.in);
		ammount=inp.nextInt();
		
		if (ammount>=5000)
		{
			System.out.println("Purchased ammount is: "+ammount);
			System.out.println("Discount ammount is: "+(ammount*0.1) );
			System.out.println("Ammount to be paid: "+(ammount-(ammount*0.1)));
			
		}
		else 
		{
			System.out.println("Purchased ammount is: "+ammount);			
			System.out.println("No Discount ");
			System.out.println("Ammount to be paid: "+ammount);
		}
		

	}

}





class WhileLoop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=0;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}

	}

}


class ReverseDigit 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num = 123, reversed = 0;
	    
	    System.out.println("Original Number: " + num);

	    // run loop until num becomes 0
	    while(num != 0) {
	    
	      // get last digit from num
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	      // remove the last digit from num
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	}

}



class intreverseFor
{
	public static void main(String args[])
	{	
		int num, rev=0;
		System.out.print("Enter the number: ");
		Scanner inp=new Scanner(System.in);
		num=inp.nextInt();
		int len=String.valueOf(num).length();
		for (int i=0;i<len;i++)
		{
			int r=num%10;
			rev=rev*10+r;
			num/=10;
		}
		System.out.println("Reversed integer is: "+rev);
	}
}

class IntRev
{
	public static void main(String args[])
	{
		int num=654321, rev=0;
		System.out.println("Original Number is: "+num);
		while (num!=0)
		{

		
			int r = num % 10;
			
			rev = rev * 10 + r;

			num /= 10;

		}
		System.out.println("After Reversing: "+rev);
	}
}







class devision
{
	public static void main(String args[])
	{
		float a=22, b=7;
		System.out.println(a/b);
	}
}



class DoWhile {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=1;
		do
		{
			System.out.println(i);
			i++;
			
		}
		while(i<=10);

	}

}


class Forloop
{
    public static void main(String[]args)
    {
        for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
    }
}



class Pattern
{
    public static void main(String[]args)
    {
        for (int i=0;i<6;i++)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
    }
}




class PatternByMaam
{
    public static void main(String[]args)
	{

		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*"+"\t");
			}
			System.out.print("\n");
		}

		

	}
}




class RightRectangle
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for (int k=5;k>i;k--)  //k<=i for opposite side rightangle triangle
			{
				System.out.print("\t");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print("*"+"\t");
			}
		System.out.print("\n");
		}
	}
}



class PyramidPattern  
{    
	public static void main(String args[])   
	{    
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j, row = 6;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
			//inner loop work for space      
			for (j=row-i; j>1; j--)   
			{  
				//prints space between two stars  
				System.out.print(" ");   
			}   
			//inner loop for columns  
			for (j=0; j<=i; j++ )   
			{   
				//prints star      
				System.out.print("* ");   
			}   
			//throws the cursor in a new line after printing each line  
			System.out.println();   
		}   
	}   
}  


class Pyramid
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for (int k=5;k>i;k--) 
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;++j)
			{
				System.out.print("*"+" ");
			}
		System.out.println();
		}
	}
}



class RightTriangle
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for (int k=5;k<i;k--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
		System.out.println();
		}
	}
}



class RevPyramid
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print("*"+" ");
			}
			System.out.print("\n");
			for (int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
		}
	}
}




class OperatorExample
{
	public static void main(String args[])
	{
		int a=10;int b=10;
		System.out.println(a-- + ++a);
		System.out.println("aaa");
		
	}
}  


class InifniteLoop
{
	public static void main(String args[])
	{
		for (int i=0;i>=0;i++)
		{
			System.out.println("*");
		}
	}
}

class abc
{
	public static void main(String args[])
	{
		for (int i=1;i<4;i++)
		{
			for (int j=1;j<6;j++)
			{
				if (j<=2+i && j>=4-i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}






class inptry
{
	public static void main(String[] args) 
	{
			
	}
}