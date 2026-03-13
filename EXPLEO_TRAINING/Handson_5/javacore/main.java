package javacore;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       //fr2
      employee ob= new permanentemployee("2","adi",1000.0,20.0);
     System.out.println( "permanent employee salary: "+ob.calsalary());
     //fr3
     employee ob1= new contractemployee("1","kp",1000.0,0.2,0.5);
     System.out.println("contract employee salary: "+ ob1.calsalary());
     //fr4
     employee ob2= new intern("1","kp",500.0);
     System.out.println("intern's stipend: "+ ob2.calsalary());
     
     System.out.println( ob.toString());
     System.out.println( ob1.toString());
     System.out.println( ob2.toString());

     
	}

}
