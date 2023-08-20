package ketan1new;
import java.util.*;
import java.io.*;

public class Filehandle throws Exception{

			public static void main(String[] args) 			{
				String name,address,std;
				int marks;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter student name:");
				name=sc.next();
				System.out.println("Enter student address:");
				address=sc.next();
				System.out.println("Enter student class:");
				std=sc.next();
				System.out.println("Enter student  marks:");
				marks=sc.nextInt();
				File f = new File("D://X//rupesh7.txt");
			    if (f.createNewFile()) {
			    	
			    
				FileWriter fw = new FileWriter ("rupesh7.txt");
				fw.write("Name:"+name+"\n");
				fw.write("Address:"+address+"\n");
				fw.write("Class:"+std+"\n");
				fw.write("Marks:"+marks+"\n");
				fw.close();
				System.out.println("File is created successfully with the content.");
				FileReader fr=new FileReader("rupesh7.txt");
				int ch;
				System.out.println("\nStudent Data:");
				while((ch=fr.read())!=-1)
				{
					System.out.print((char)ch);
				}
				sc.close();
				fr.close();
			    }
			    else{
			    	System.out.println("File already exists.");
			    	}
			    	//write content
			    	FileWriter fw = new FileWriter (file);
			    	fw.write("Test data");
			    	fw.write("Name:"+name+"\n");
					fw.write("Address:"+address+"\n");
					fw.write("Class:"+std+"\n");
					fw.write("Marks:"+marks+"\n");
			    	fw.close();			    
		

//File file = new File("D://X//rupesh.txt");
////create the file.
//if (file.createNewFile()){
//System.out.println("File is created!");
//}
//else{
//System.out.println("File already exists.");
//}
////write content
//FileWriter writer = new FileWriter (file);
//writer.write("Test data");
//writer.close();
		

			}
}
