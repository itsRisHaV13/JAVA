import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import javax.swing.text.PlainView;

class abc
{
	public static void main(String args[])
	{
		System.out.println("  +\"\"\"\"\"+");
        System.out.println("[ | 0 0 | ]");
        System.out.println("  |  ^  |");
        System.out.println("  | '_' |");
        System.out.println("  +-----+");
	}
}

class swap2no
{
    public static void main(String args[])
    {
        int a=2,b=3;

        System.out.println("Before reversing a="+a + " b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After reversing a="+a +" b="+b);
        //System.out.println(b);
    }
}

class fib
{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,i,count=10;    
        System.out.print(n1+" "+n2); 
    
        for(i=2;i<count;++i) 
        {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }    
    }
}





class IntRevv
{
	public static void main(String args[])
	{
		int rev=0,num,r;
        
        // System.out.println("Enter number: ");
        
        // Scanner inp=new Scanner(System.in);
        // num=inp.nextInt();
        num=-123;
		
        System.out.println("Original Number is: "+num);
		
        while (num!=0)
		{

		
		    r = num % 10;
			
			rev = rev * 10 + r;

			num /= 10;

		}
		System.out.println("After Reversing: "+rev);
	}
}





class classEmp
{
    int empid;
    String name;
    void display()
    {
        System.out.println("Hello"+" "+name+"\n"+"youre id is: "+empid);
    }
    public static void main(String args[])
    {
        classEmp e1=new classEmp();
        e1.empid=2345;
        e1.name="Rishav";
        e1.display();
    }  
}


class classEmpInp
{
    int empid;
    String name;
    void input()
    {
        System.out.println("Enter id: ");
        Scanner inp=new Scanner(System.in);
        empid=inp.nextInt();

        System.out.println("Enter name: ");
        Scanner inp1=new Scanner(System.in);
        name=inp1.nextLine();

    }
    void display()
    {
        System.out.println("Hello"+" "+name+"\n"+"youre id is: "+empid);
    }
    public static void main(String args[])
    {
        classEmpInp e1=new classEmpInp();
        e1.input();
        e1.display();
    }
}



// Example of default,parametrized constructor 
class box
{
    int l,h,d;
    box()
    {
        l=h=d=10;   
    }
    box(int x, int y)
    {
        h=x;
        d=y;
    }
    box(int x,int y,int z)
    {
        this.h=x;
        d=y;
        l=z;
    }

}
class boxclass
{
    public static void main(String[] args) 
    {
        box b1=new box();
        System.out.println("Depth ="+b1.d);

        box b2=new box(10,20);
        System.out.println("Depth ="+b2.d);

        box b3=new box(30,40,50);
        System.out.println("Depth ="+b3.d);
    }
}



class stat
{
    static int id;
    public static void main(String[] args) {
        id=34;
        System.out.println("Value of id="+id);
    }
}



class array
{
    public static void main(String[] args) 
    {
        int[] arr=new int[10];
        System.out.println("Enter element");
        for (int i=0;i<5;i++)
        {
            Scanner inp=new Scanner(System.in);
            arr[i]=inp.nextInt();
        }
        for (int j=0;j<5;j++)
        {
            System.out.print(arr[j]);
        }
    }
}


class DeclareArray
{
    public static void main(String[] args) 
    {
        int[] initialize={2,21,5,6,12}; //declare and initialize array
        
        int[] declare= new int[5]; // declare
        declare[0]=12;
        declare[1]=4;
        declare[2]=5;
        declare[3]=21;
        declare[4]=12;

        //System.out.println(initialize[3]);
        //System.out.println(declare[3]);
        int c=0;
        for (int i=0; i< declare.length; i++)
        {
            System.out.println(declare[i]);
            c++;
            
        }
        System.out.println("No. of elements="+c);
    }
}


class arrayTransverseOddEven
{
    public static void main(String[] args) 
    {
        int[] initialize={2,21,5,6,12};
        for (int i: initialize)
        {
            //System.out.println(i);
            if (i%2==0)
            {
                System.out.println("Even: "+i);
            }
            else
            {
                System.out.println("Odd: "+i);
            }
        }
    }
}

class ArraySearch
{
    public static void main(String[] args) 
    {
        int[] initialize={2,21,5,6,12};
        int len=initialize.length;
        int num=55;
        int k=0;
        for(int i=0;i<len;i++){
            if (initialize[i]==num){
                System.out.println("Element "+num+" is on index number: "+i);
                k=1;
            }
        } 
        if(k==0)
        {
            System.out.println("Element not found");
        }   
    }
}





class ArraySumAvg 
{
    public static void main(String[] args) 
    {
   
      int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
      int sum = 0;
      Double average;
    
      for (int number: numbers) 
      {
        sum += number;
      }
     
      int arrayLen = numbers.length;
   
      average=((double)sum / (double)arrayLen);
   
      System.out.println("Sum = " + sum);
      System.out.println("Average = " + average);
    }
}

class LargestSmallest
{
    public static void main(String[] args) 
    {
        int[] arr={2,9,8,1,4,6,7,6};
        int len=arr.length;
        Arrays.sort(arr);
        System.out.println(arr[2]);
        /*for (int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }*/

        System.out.println("Smallest element present in array is: "+arr[0]);
        System.out.println("Largest element present in array is: "+arr[len-1]);
    }
}

class indexing
{
    public static void main(String[] args) 
    {
        int[] arr={2,9,8,1,4,6,7,6};
        int len=arr.length;
        //Arrays.sort(arr);
        for(int i:arr)
        
        System.out.print(i+" ");
            
    }
}

// Polymorphism

class Fact
{
    public static void main(String[] args) {
        Integer a=Integer.parseInt(args[0]);

        int fac=1;

        for (int i=1;i<=a;i++)
        {
            fac*=i;

        }
        System.out.println(fac);
    }
}


class CommandLineArguments {

	public static void main(String[] args) {
		System.out.println("Number of Command Line Argument = "+args.length);
		
		for(int i = 0; i< args.length; i++) {
			System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
		}
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



  
class geeks 
{
    public static void main(String[] args)
    {
              
        int a = 168;
        System.out.println("Number = " + a);              
        // It returns the value obtained by reversing order of the bits
        System.out.println("By reversing we get = " + Integer.reverse(a));
    }
}

// Java program for the above approach

class GFG {

	// Function to print N Fibonacci Number
	static void Fibonacci(int N)
	{
		int num1 = 0, num2 = 1;

		int counter = 0;

		// Iterate till counter is N
		while (counter < N) {

			// Print the number
			System.out.print(num1 + " ");

			// Swap
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
	}

	// Driver Code
	public static void main(String args[])
	{
		// Given Number N
		int N = 10;

		// Function Call
        Fibonacci(N)
	}
}


// Dynamic Programming approach for
// Fibonacci Series

class fibonacci {

	// Function to find the fibonacci Series
	static int fib(int n)
	{

		// Declare an array to store
		// Fibonacci numbers.
		// 1 extra to handle case, n = 0
		int f[] = new int[n + 2];

		int i;

		// 0th and 1st number of
		// the series are 0 and 1
		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++) {

			// Add the previous 2 numbers
			// in the series and store it
			f[i] = f[i - 1] + f[i - 2];
		}

		// Nth Fibonacci Number
		return f[n];
	}

	public static void main(String args[])
	{
		// Given Number N
		int N = 10;
        

		// Print first 10 term
		for (int i = 0; i < N; i++)
		{
        System.out.print(fib(i) + " ");
        }
	}
}
