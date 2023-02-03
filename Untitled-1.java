import javax.lang.model.util.ElementScanner14;

class ClassName
{
    public static void main(String args[])
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
        int a=5;
        a++;
        System.out.println(a);
    }
}