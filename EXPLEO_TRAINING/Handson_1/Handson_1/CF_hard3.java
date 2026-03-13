package Handson_1;
import java.util.Scanner;
public class CF_hard3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int n = sc.nextInt();
		int n1 =n;
		int i=0,j=0;
		while(n!=0) {
			j+=n%10;
			n/=10;
			i++;
		}
		if(i==4) {
			if(j%3==0 || j%5==0 || j%7==0) {
				System.out.println("Lucky Number");

			}
			else {
				System.out.println("Sorry it’s not my lucky number");
	
			}
		
		}
		else {
			System.out.println(n1+ " is not a valid car number");

		}

	}

}
