package javacore;

public class contractemployee extends employee {
  double taxrate;
  double servicecharge;
  contractemployee(String empid, String empname, double basesalary, double taxrate, double servicecharge){
	  super(empid,empname,basesalary);
	  this.taxrate=taxrate;
	  this.servicecharge=servicecharge;
	  
  }
   public double calsalary() {
	   return basesalary -(basesalary*taxrate)-servicecharge;
   }
}
