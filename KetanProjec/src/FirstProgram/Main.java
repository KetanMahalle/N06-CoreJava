package FirstProgram;
import java.lang.Thread;
//Method Synchronization 
class ketan2{
	public synchronized void try1(int n) {
		for (int i=1;i<=10;i++) {
			int a=i*n;
			System.out.println(a);
		}
		
	}
	
}

class ketan3 extends Thread{
	
	ketan2 k1= new ketan2();
	ketan3(ketan2 k1)
	{
		this.k1=k1;
		
	}
	public void run()
	{
		k1.try1(5);
	}
}
class ketan4 extends Thread{
	
	ketan2 k1= new ketan2();
	ketan4(ketan2 k1)
	{
		this.k1=k1;
		
	}
	public void run()
	{
		k1.try1(7);
	}
}
public class Main {
	public static void main(String[] args) {
		ketan2 k2= new ketan2();
		ketan3 k1= new ketan3(k2);
		ketan4 k3=new ketan4(k2);
		
		k1.start();
		k3.start();
	}
	
}



//Multi Threading

// class ketan extends Thread{
//	public void run() {
//		try{
//			for (int i=1;i<=5;i++) {
//				System.out.println("My Name is Ketan");
//				Thread.sleep(1000);
//				}
//			}catch(InterruptedException i) {
//			
//				System.out.println("Exception is Caught.");
//			}
//	
//	}
//}


//public class Main {
//	public static void main(String[] args)throws InterruptedException {
//		ketan k = new ketan();
//		// TODO Auto-generated method stub
//		k.start();
//		for (int i=1;i<=5;i++) {
//		System.out.println("My Surname is Mahalle.");
//		Thread.sleep(1000);
//		}
//	
//	}
//
//}
