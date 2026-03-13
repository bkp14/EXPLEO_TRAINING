package Handson_1;
import java.util.Scanner;
public class CF_easy9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n =sc.nextInt();
	      int sum = 0;

	        while (n > 0) {
	            sum += n % 10;  
	            n = n / 10;     
	        }

	        System.out.println(sum);

	}

}
