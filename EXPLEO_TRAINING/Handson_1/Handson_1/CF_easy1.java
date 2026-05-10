package Handson_1;
import java.util.Scanner;
public class CF_easy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter name: ");

String name = sc.nextLine();

System.out.println("Enter wage: ");

int wage = sc.nextInt();
System.out.println("Enter days: ");

int days = sc.nextInt();
System.out.println("Employee details: ");
System.out.println("name: "+name);
System.out.println("Salary "+(wage*days));
sc.close();

	}

}
