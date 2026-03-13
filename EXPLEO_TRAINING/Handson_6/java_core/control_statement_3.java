package java_core;
import java.util.Scanner;

public class control_statement_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String s = sc.next().toUpperCase();
if(s.equals("REGULAR")) {
	System.out.println("you have selected regular seat and the rate is rs.80");
}
else if(s.equals("PREMIUM")) {
	System.out.println("you have selected premium seat and the rate is rs.100");
}
else if(s.equals("EXECUTIVE")) {
	System.out.println("you have selected executive seat and the rate is rs.120");
}
else if(s.equals("VIP")) {
	System.out.println("you have selected vip seat and the rate is rs.150");
}
else {
	System.out.println("you have not selected any seat type");
}
	}

}
