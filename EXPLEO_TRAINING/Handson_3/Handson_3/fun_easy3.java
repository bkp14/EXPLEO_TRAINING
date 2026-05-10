package Handson_3;
import java.util.*;
public class fun_easy3 {
   double bonus(double n1,int n) {
	   return n+(n*(n1/100));
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary: ");
		int n = sc .nextInt();
		System.out.println("enter hike: ");
		double n1 = sc .nextInt();
		fun_easy3 ob = new fun_easy3();
		System.out.println(ob.bonus(n1, n));
	}

}
