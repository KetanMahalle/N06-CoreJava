package TNSPackage;
import java.util.*;
public class JavaForTNS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String Name = s.nextLine();
		System.out.println("Enter Your Salary: ");
		Long Salary = s.nextLong();
		System.out.println("Enter Your Age: ");
		int Age = s.nextInt();
		System.out.println("My Name is : "+ Name);
		System.out.println("My Salary is : "+ Salary);
		System.out.println("My Age is : "+ Age);
		s.close();
	}

}
