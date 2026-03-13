package Handson_1;
import java.util.Scanner;
public class CF_easy6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c=0;
		while(true) {
		int n = sc.nextInt();
		if(n>=0) {
			for(int i=1;i<=n;i++) {
				System.out.println("hello");
				c++;
			}
		}
		else if(n<0) {
			System.out.println(c);
			break;
		}
		}
		
	}

}
