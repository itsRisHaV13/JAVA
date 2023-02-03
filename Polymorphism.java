import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.*;
import java.util.Scanner;

// Polymorphism

//Compile time polymorphism / Method overloading

class shape
{

    static int ar(int l)
    {
        return (l*l);
    }
    static int ar(int l,int b)
    {
        return (l*b);
    }
    static double ar(double r)
    {
        return (3.14*r*r);
    }
    
}

class Testshapes
{
    public static void main(String[] args) 
    {
        System.out.println(shape.ar(2,4));
        System.out.println(shape.ar(5));
        System.out.println(shape.ar(9.0));
    }
}



// INHERITANCE


class OverRiding
{
    void display()
    {
        System.out.println("Hello");
    }
}
class OverRided extends OverRiding
{
    void display()
    {
        System.out.println("Hi");
    }
}
class over
{
    public static void main(String[] args) 
    {
        OverRided a=new OverRided();
        a.display();    
    }
}

// overloading
class overload{
    overload(int x){
        System.out.println(x);
    }
    overload(int x,int y){
        System.out.println(x+y);
    }
    overload(int x,int y,int z){
        System.out.println(x+y+z);
    }
}
class over1{
    public static void main(String[] args) {
        overload o=new overload(2,6);
    }
}

//Inheritance

//Single level

class SuperClass
{
    String name="Calling via super keyword";
    //void output() //
    void display()
    {
        System.out.println("We are in Super Class");
    }
}
class SubClass extends SuperClass
{
    void display()

    {
        //super.output();
        super.display();
        System.out.println("We are in Sub Class");
        System.out.println(super.name);
    }
}

class main
{
    public static void main(String[] args) 
    {
        SubClass s1= new SubClass();
        //SuperClass s1= new SubClass();
        
        //s1.output();
        s1.display();  
    }
}






//MultiLevel

class Parrent
{
    void display()
    {
        System.out.println("Parrent class");
    }
}

class Child extends Parrent
{
    void show()
    {
        System.out.println("Child class");
    }
}

class SubChild extends Child
{
    void print()
    {
        super.display();
        super.show();
        System.out.println("Sub Child class");
    }
}

class TestMultiple
{
    public static void main(String[] args) 
    {
        SubChild sc = new SubChild();
        //sc.display();
        //sc.show();
        sc.print();   
    }
    
}



// Hierarchical


class Hierarchical
{
    void display()
    {
        System.out.println("Parrent Hierarchical class");
    }
}

class HChild1 extends Hierarchical
{
    void show()
    {
        super.display();
        System.out.println("Child class 1");
    }
}

class HChild2 extends Hierarchical
{
    void print()
    {
        super.display();
        System.out.println("Child class 2");
    }
}

class TestHerarichal
{
    public static void main(String[] args) 
    {
        HChild1 hc1 = new HChild1();
        HChild2 hc2 = new HChild2();
        
        //hc1.show();
        hc2.print();
    }
}


class Sentence
{
    public static void main(String[] args) 
    {
        String str="welcome to niet";

        System.out.println(str.toUpperCase());    
        System.out.println(str.toLowerCase());
        
        String output = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(output);
        
        int c = 'A';
        System.out.println(c);

        for(int i = 65; i <= 90; i++)  
        {  
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
        }  
    }

}

class DefaultValue
{
    static int a;
    static float b;
    static boolean c;
    static double d;
    static char e;
    static long f;
    static byte g;
    static short h;

    public static void main(String[] args) 
    {
            
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        
    }
}


class ArthematicOperation
{
    public static void main(String[] args) 
    {
        int a=4,b=2;
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
    }
}

class StrTOint
{
    public static void main(String[] args) {
        String a="12";
        //int b=Integer.parseInt(a);
        int b=Integer.valueOf(a);
        
        System.out.println(b);

       int k=1234;
       String s= String.valueOf(k);
       
       System.out.println(s);

    }
}

class cml
{
    public static void main(String[] args) 
    {
        for (int i=0;i<3;i++)
        {
            System.out.println(args[i]);
        }    
    }
}




class command
{
    public static void main(String args[])
    {
        String name=args[0];
        System.out.println(name);
        
    }
}



class ArthematicException
{
    public static void main(String[] args)
    {
        int a=5,b=0,c;
        int arr[]=new int[5];
        try
        {
            c=a/b;
            System.out.println(c);
            arr[6]=4;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);   
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally
        {
            System.out.println("Hello, Its completed!");
        }
    }
}


class ArrayIndexoutofBound
{
    public static void main(String[] args) 
    {
        try
        {
            int[]a=new int[2];
            System.out.println(a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)    
        {
            System.out.println(e);
        }
    }
}



class ThorowNew 
{
    static void checkAge(int age) 
    {
      if (age < 18) 
      {
        throw new ArithmeticException("Access denied - You must be at least 18 years old.");
      }
      else 
      {
        System.out.println("Access granted - You are old enough!");
      }
    }
  
    public static void main(String[] args) 
    {
      checkAge(19); // Set age to 15 (which is below 18...)
    }
}



class ThorowNew
{
    public static void main(String[] args) 
    {
        try
        {
            int age=19;
        }
    }
}



class StringHandling
{
    public static void main(String[] args) 
    {
        String s="Hello ";
        String newstr="";
        int len=s.length();
        for (int i=0; i<len;i++)
        {
            char ch=s.charAt(i);
            newstr=ch+newstr;
        }
        System.out.println(newstr);
    }
}


class stringRev
{
    public static String rev(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) 
    {
        String str= "Hello";
        str=rev(str);
        System.out.println(str);    


        // String s= "Hello World";
        // s= new StringBuilder(s).reverse().toString();
        // System.out.println(s);  
    }
}




class FindVowel
{
    public static void main(String[] args) 
    {
          String s="Hello , Goodmorning Everyone!";
          s=s.toLowerCase();
          int c=0;
          for (int i=0;i<s.length();i++)
          {
            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                c++;
                System.out.println(s.charAt(i)+" at the index "+i);
            }
          }
          System.out.println("Total no. of vowels= "+c);
    }
}


interface lambd{
    public void display();
}
public class lambda_class1{
    public static void main(String[] args) {
        int x=1;
        lambd l1=()->System.out.println("Hi");
        //System.out.println(l1.display());
        l1.display();
    }
}

interface l{
	public void display();
}
class lamb {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		l c=()->System.out.println("Hi");
//		System.out.println(c.display());
		c.display();
	}

}





class Multi extends Thread{  
    public void run(){  
    System.out.println("thread is running...");  
    }  
    public static void main(String args[]){  
    Multi t1=new Multi();  
    t1.start();  
     }  
    }  



class Multi3 implements Runnable{  
    public void run(){  
    System.out.println("thread is running...");  
    }  
        
    public static void main(String args[]){  
    Multi3 m1=new Multi3();  
    Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
    t1.start();  
    }  
}  


// C= (5/9)*(f-32)


class conv
{
    public static void main(String[] args) 
    {
        int F=100;
        // Scanner sc=new Scanner(System.in);
        // int F=sc.nextInt();
        //float C= (float)((5.0/9)*(F-32));
        double C=(double)5/9;
        System.out.println(C);
    }
}




    