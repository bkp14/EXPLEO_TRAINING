package Handson_1;
import java.util.Scanner;
public class CF_hard4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		if(n<2000) {
			System.out.println(n*0.95);
		}
		else if(n>=2000&&n<5000) {
			System.out.println(n*0.75);

		}
		else if(n>=5000&&n<10000) {
			System.out.println(n*0.65);

		}
		else if(n>=10000) {
			System.out.println(n*0.50);

		}
		else {
			System.out.println("Enter a valid amount");

		}
	}

}
