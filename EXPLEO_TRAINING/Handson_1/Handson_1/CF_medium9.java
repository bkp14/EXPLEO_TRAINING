package Handson_1;
import java.util.*;
public class CF_medium9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 =n;
		int n2=n;
		int i=0,sum=0;
		while(n1!=0) {
			n1/=10;
			i++;
		}
		while(n2!=0) {
			
			sum+=Math.pow( n2%10,i);
			n2/=10;
			
		}
		if(sum==n) {
			System.out.println("it is a armstrong number");
		}
		else {
			System.out.println("it is not a armstrong number");

		}
	}

}
