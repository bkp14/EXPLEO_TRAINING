package javacore;

public class intern extends employee {
 double stipend;
 intern(String empid,String empname,double stipend){
	 super(empid,empname);
	 this.stipend=stipend;
 }
 public double calsalary() {
	 return stipend;
 }
}
