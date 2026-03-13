package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable{
      public static  int empid;
      public  String empname;
      
      public Employee(int id,String name) {
    	  empid=id;
    	  empname=name;
      }
      
 }
 
      public class Employee_serialization {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Employee ob = new Employee(1,"ram");
   String filename = "file.ser";
   //serialization
   try {
	   FileOutputStream file = new FileOutputStream(filename);
	   ObjectOutputStream out = new ObjectOutputStream(file);
	   
	   out.writeObject(ob);
	   out.close();
	   file.close();
	   System.out.println("object has been serialized");
   }
   catch(IOException e) {
	   System.out.println("IOException caught");

   }
   //deserialization
   Employee object1 = null;
   try {
	   FileInputStream file = new FileInputStream(filename);
	   ObjectInputStream in = new ObjectInputStream(file);
	   object1 = (Employee)in.readObject();
	   in.close(); file.close();
	   System.out.println("ob has been derialized");
	   System.out.println("empid"+object1.empid+"\nempname: "+object1.empname);

   }
   catch(IOException e) {
		  System.out.println("IOException: "+e);
	  }
   catch(ClassNotFoundException ex) {
		  System.out.println("ClassNotFoundException: "+ex);

   }
	}

}
