package Handson_1;
import java.util.*;
public class CF_medium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price : ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity : ");
        int quantity = sc.nextInt();

        double total;

        if (quantity > 500) {
            total = quantity * price * 0.85;
        } else {
            total = quantity * price;
        }

        System.out.println("Total expenses: " + total);
	}

}
