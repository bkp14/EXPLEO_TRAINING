package java_core;
import java.util.Scanner;
public class If_seats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the seat number: ");
  boolean seatavail=true;
  String s = sc.nextLine();
  if(seatavail) {
	  System.out.println("you have booked the seat: "+s);
  }
  else {
	  System.out.println(" the seat "+s+ " is not availabale");
  }
	}

}
