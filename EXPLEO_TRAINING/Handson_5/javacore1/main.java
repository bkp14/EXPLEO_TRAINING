package javacore1;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
   Scanner sc = new Scanner(System.in);
   System.out.println("enter preferred payment method:");
   System.out.println("1.CreditCardPayment");
   System.out.println("2.UPIPayment");
   System.out.println("3.NetBankingPayment");
   System.out.println("4.exit");



  int s = sc.nextInt();
   payment ob;
   switch(s) {
   case 1:
	   
	   System.out.println("enter amount");
	   double s2=sc.nextDouble();
	   sc.nextLine();
	   System.out.println("enter customerName");
	   String s3=sc.nextLine();
	   System.out.println("enter cardNumber");
	   String s4=sc.nextLine();
	   System.out.println("enter cvv");
	   String s5=sc.nextLine();
	   System.out.println("enter expiryDate");
	   String s6=sc.nextLine();
	   ob = new CreditCardPayment(String.valueOf(Math.abs(r.nextInt())),s2,s3,s4,s5,s6);
	   ob.executeTransaction();
	   
	   break;
   case 2:
	   
	   System.out.println("enter amount");
	   double c2=sc.nextDouble();
	   sc.nextLine();
	   System.out.println("enter customerName");
	   String c3=sc.nextLine();
	   System.out.println("enter upi id");
	   String c4=sc.nextLine();
	   System.out.println("enter upi pin");
	   String c5=sc.nextLine();
	   ob = new UPIPayment(String.valueOf(Math.abs(r.nextInt())),c2,c3,c4,c5);
	   ob.executeTransaction();
	   break;
   case 3:
	   
	   System.out.println("enter amount");
	   double d2=sc.nextDouble();
	   sc.nextLine();
	   System.out.println("enter customerName");
	   String d3=sc.nextLine();
	   System.out.println("enter bankName");
	   String d4=sc.nextLine();
	   System.out.println("enter accountNumber");
	   String d5=sc.nextLine();
	   System.out.println("enter ifscCode");
	   String d6=sc.nextLine();
	   ob = new NetBankingPayment(String.valueOf(Math.abs(r.nextInt())),d2,d3,d4,d5,d6);
	   ob.executeTransaction();

	   break;
   case 4:
	   System.out.println("exit");
   }
	}

}
