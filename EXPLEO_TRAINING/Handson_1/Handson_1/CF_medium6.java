package Handson_1;
import java.util.Scanner;
public class CF_medium6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		int n = sc.nextInt();
		if(n>=1000) {
			System.out.println("The amount you should pay is :"+(int)(n*0.90));
		}
		else if(n<1000&&n>=1) {
			System.out.println("The amount you should pay is :"+(int)(n*0.95));

		}
	}

}
