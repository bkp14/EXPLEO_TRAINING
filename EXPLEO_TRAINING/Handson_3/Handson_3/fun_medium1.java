package Handson_3;
import java.util.Scanner;
public class fun_medium1 {
  static void sum(int low, int high) {
	  int odd=0,even=0;
	  for(int i=low;i<=high;i++) {
		  if( i%2 !=0 ) {
			  odd+=i;
		  }
		  else {
			  even+=i;
		  }
	  }
	  System.out.println("the sum of odd number from "+low+" to "+high+" = "+odd);
	  System.out.println("the sum of even number from "+low+" to "+high+" = "+even);
	  System.out.println("the absolute difference is "+ Math.abs(even-odd));

  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lowerbound: ");
		int n = sc.nextInt();
		System.out.println("enter higherbound: ");
		int n1 = sc.nextInt();
		sum(n,n1);
	}

}
