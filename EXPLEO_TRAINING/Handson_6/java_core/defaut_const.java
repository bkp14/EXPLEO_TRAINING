package java_core;

public class defaut_const {
	 int id;
	 String name;
	 String des;
	 defaut_const (int id,String name,String des){
	  this.id = id;
	  this.name = name;
	  this.des = des;
	 }
	 
	 public void gettheatre() {
	  System.out.println("Enter the theatre details ");
	  System.out.println("Theatre id :"+id);
	  System.out.println("Thetare name : "+name);
	  System.out.println("Thetare description : "+des);
	 }
	 
	 public static void main(String[] args) {
	  
	 }
	}


