package Handson_1;
import java.util.Scanner;
public class CF_easy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");

		int num = sc.nextInt();
		if(num <= 7 && num>=1) {
			if(7 % num ==0) {
				System.out.println(num+ " is a divisor of 7");
			}
			else {
				System.out.println(num+ " is not a divisor of 7");
			}
		}
			else {
				System.out.println(num+ " is not a divisor of 7");	
		}
		sc.close();
	}

}
