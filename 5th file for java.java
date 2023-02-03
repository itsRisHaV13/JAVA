// Java program to demonstrate syntax of assertion
import java.util.Scanner;

class Test {
	public static void main(String args[])
	{
		int value = 11;
		assert value >= 20 : " Underweight";
		System.out.println("value is " + value);
	}
}



class sum
{

	static void s2no(int x ,int y)
	{
		System.out.println(x+y);
	}
	public static void main(String[]args)
	{
		//sum s=new sum();
		//s.s2no(3,8);
		s2no(7,9);
	}

}



// Threads in JAVA

class multi implements Runnable{
	public void run()
	{
		System.out.println("Thread is Running...");
	}
	public static void main(String[] args) {
		multi m1=new multi();
		Thread t1=new Thread(m1);
		t1.start();
	}
}


class multi1 extends Thread{
	public void run(){
		System.out.println("Thread is Running...");
	}
	public static void main(String[] args) {
		multi1 m1=new multi1();
		m1.start();
	}
}


class switch1
{
	public static void main(String[] args) {
	int n=123;
	switch(n){
		case 1:System.out.println("Hi");
		break;
		case 123: System.out.println("Hello");
		break;
		default: System.out.println("Nothing");
	}
	}
		
}	

class multi2 extends Thread{
	public void run(){
	if (Thread.currentThread().isDaemon()){
		System.out.println("Daemon");
	}
	else{
		System.out.println("Thread");
	}
	}
	public static void main(String[] args) {
		multi2 m1 = new multi2();
		multi2 m2 = new multi2();
		m1.setDaemon(true);
		m1.start();
		m2.start();
		printf("multi2.main()");
	}
}



class moverload{
	public static int ar(int l)
	{
		return (l*l);
	}
	static int ar(int l,int x)
	{
		return (l*x);
	}
}

class mainfn{
	public static void main(String[] args) {
		System.out.println(moverload.ar(5,2));
	}
}


class inpttry
{
	public static void main(String[] args) {
		int a;
		Scanner inp = new Scanner(System.in);
		a = inp.nextInt();
		System.out.println(a);
	}
}

class Error
{
	public static void main(String[] args) {
		try{
			int a=5/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}