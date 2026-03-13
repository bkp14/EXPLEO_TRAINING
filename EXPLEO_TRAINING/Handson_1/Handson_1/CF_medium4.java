package Handson_1;
import java.util.Scanner;
public class CF_medium4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);

	        System.out.print("Enter browsing hours: ");
	        int h = sc.nextInt();

	        System.out.print("Enter browsing minutes: ");
	        int m = sc.nextInt();

	        int tot = h * 60 + m;
	        int bill=0;
	        if (tot > 420) {   
	            System.out.println("Browsing time exceeded maximum limit of 7 hours.");
	            
	        }
	        else if(tot>=300) {
	        	int h1 = tot/60;
	        	int m1=tot-h*60;
	        	bill= h1*40+m1;
	        }
	        else {
	        	bill = h*50+m;
	        }
	        System.out.println("the bill is :"+bill);
	}

}
