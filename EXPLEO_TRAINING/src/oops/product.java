package oops;
import java.util.Scanner;
public class product {
	private int productid;
	private String productname;
	private double price;
	private int quantity;
      product( int productid, String productname, double price, int quantity){
    	  this.productid=productid;
    	  this.productname =productname;
    	  this.price=price;
    	  this.quantity=quantity;
      }
      public void getproductdetails() {
    	  System.out.println("productid"+productid);
    	  System.out.println("productname"+productname);
    	  System.out.println("productprice"+price);
    	  System.out.println("product quantity"+quantity);

      }
      public void setquantity(int newqty) {
    	  quantity+=newqty;
      }
      void calculatetotal() {
    	  double total= price*quantity;
    	  System.out.println("the total bill is "+total);
      }
}
