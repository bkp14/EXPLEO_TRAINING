package Handson_1;
import java.util.Scanner;

public class CF_Medium3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter pages: ");
	        int p = sc.nextInt();

	        System.out.print("Enter number of copies: ");
	        int c = sc.nextInt();

	        int t = p * 3; 
	        int pr;

	        if (c == 1) {
	            pr = c * 1;
	        }
	        else if(c==0) {
	        	pr=0;
	        }
	        else {
	            pr = p*((c*3)-2);
	        }

	        int total = t + pr;

	        System.out.println("Total bill: Rs. " + total);
	}

}
