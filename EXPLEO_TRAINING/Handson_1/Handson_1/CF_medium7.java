package Handson_1;
import java.util.Scanner;
public class CF_medium7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic salary: ");
		int n = sc.nextInt();
		if(n<=10000) {
		int hr= (n*20)/100;
		int da = (n*80)/100; 
		System.out.println("Gross Salary: "+(n+hr+da));
		}
		else if(n>10000&&n<20000) {
			int hr= (n*25)/100;
			int da = (n*90)/100; 
			System.out.println("Gross Salary: "+(n+hr+da));
			}
		else if(n>=20000) {
			int hr= (n*30)/100;
			int da = (n*95)/100; 
			System.out.println("Gross Salary: "+(n+hr+da));
			}
	}

}
