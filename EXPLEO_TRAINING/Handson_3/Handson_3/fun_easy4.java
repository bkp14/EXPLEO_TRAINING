package Handson_3;
import java.util.*;
public class fun_easy4 {
   static void eligibility(int n) {
	   if(n >=18) {
		   System.out.println("eligible");
	   }
	   else {
		   System.out.println("not eligible");

	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.println("enter age: ");
		   int n = sc.nextInt();
		   eligibility(n);
	}

}
