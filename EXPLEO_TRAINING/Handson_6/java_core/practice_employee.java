package java_core;
import java.util.*;
public class practice_employee {
	
	 int id;
	 String name;

	 public void setDetails(int id,String name) {
	  this.id = id;
	  this.name = name;
	 }
	 public void setName(String name) {
	  
	 }
	 void display() {
	  System.out.println("Employee details");
	  System.out.println("Id : "+id);
	  System.out.println("Name : "+name);
	 }

	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  Scanner s=new Scanner(System.in);
	  practice_employee a=new practice_employee();
	  a.setDetails(s.nextInt(), s.next());
	  a.display();
	  a.setDetails(s.nextInt(), s.next());
	  a.display();
	 }

	}

