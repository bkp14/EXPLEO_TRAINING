package java_core;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class user_input {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Movie name: ");
		String s = sc.nextLine();
		System.out.println("Enter Movie description: ");
		String s1 = sc.nextLine();
		System.out.println("Enter Movie Language: ");
		String s2 = sc.nextLine();
		System.out.println("Enter Movie Genre: ");
		String s3 = sc.nextLine();
		System.out.println("Enter movie release date (dd/mm/yyyy): ");
		// String date = sc.next();
		// SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

		Date yesterday = new Date();

		System.out.println("Enter Movie seat cost: ");
		int cost = sc.nextInt();

		System.out.println(id);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(yesterday);
		System.out.println(cost);

		sc.close();
	}

}
