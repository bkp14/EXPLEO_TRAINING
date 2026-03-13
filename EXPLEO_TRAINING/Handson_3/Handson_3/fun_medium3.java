package Handson_3;
import java.util.*;
public class fun_medium3 {
static void overtime(float n ) {
	n =(float)Math.floor(n);
	float pay= (n -40)*15;
	System.out.print(pay);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter working hours: ");
		float n = sc.nextFloat();
		if(n>40) {
		overtime(n);	
		}
	}

}
