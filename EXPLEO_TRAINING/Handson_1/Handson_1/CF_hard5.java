package Handson_1;
import java.util.Scanner;
public class CF_hard5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=1) {
		int i=1,j=1,k=1;
		while(i<n) {
			i=i*(j+1);
			j++;
			k++;
		}
		if(i==n) {
		System.out.println(k);
		}
		
		else {
			System.out.println("Sorry. The given number is not a perfect factorial");

		}
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
