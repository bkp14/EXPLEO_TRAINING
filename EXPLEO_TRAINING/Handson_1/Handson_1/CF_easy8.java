package Handson_1;
import java.util.*;
public class CF_easy8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);

	        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	            System.out.println("It is an Alphabet.");
	        } 
	        else if (ch >= '0' && ch <= '9') {
	            System.out.println("It is a Digit.");
	        } 
	        else {
	            System.out.println("It is a Special Symbol.");
	        }
	}

}
