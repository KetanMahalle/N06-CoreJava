package ketan1new;
import java.util.*;
import java.lang.Thread;


//public class ketan1 {
	
	// Java code for thread creation by extending
	// the Thread class
	class MultithreadingDemo extends Thread {
		public void run()
		{
			int a=5,b=8,sum;
				sum=a+b;
			System.out.println("The Sum is: "+sum);
			return;
			
//			try {
//				// Displaying the thread that is running
//				System.out.println(
//					"Thread " + Thread.currentThread().getId()
//					+ " is running");
//			}
//			catch (Exception e) {
//				// Throwing an exception
//				System.out.println("Exception is caught");
//			}
		}
	}

	// Main Class
	public class ketan1 {
		public static void main(String[] args)
		{
			MultithreadingDemo m = new MultithreadingDemo();
			
			Scanner sc= new Scanner(System.in);
			int a= sc.nextInt();
			int b=sc.nextInt();
			int sum=a+b;
			System.out.println("The Sum in Main is: "+sum);
			
			
			
//			int n = 15; // Number of threads
//			for (int i = 0; i < n; i++) {
//				MultithreadingDemo object
//					= new MultithreadingDemo();
				m.start();
			}
		}

	
//	public static int fact(int a) 
//	{
//	int fact = 1;
//	
//		for(int i=a;i>=1;i--) {
//		   fact = fact *i;
//			
//		}
//		
//		return fact;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner Sc = new Scanner(System.in);
//		int a = Sc.nextInt();
//		
//		
//		int fact = fact(a);
//		System.out.println(fact);
//	}
//	

//}
