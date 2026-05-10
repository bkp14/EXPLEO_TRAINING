package Handson_3;
import java.util.Scanner;
public class fun_medium4 {
 static void eligible(int n,int n1) {
	  if(n>=18 && n<=55 && n1>45) {
		  System.out.println("your'e eligible");
	  }
	  else {
		  System.out.println("your'e not eligible");

	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter age: ");
		int n = sc.nextInt();
		System.out.println("enter weight: ");
		int n1 = sc.nextInt();
		eligible(n,n1);
	}

}
