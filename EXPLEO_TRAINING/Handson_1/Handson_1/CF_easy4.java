package Handson_1;
import java.util.Scanner;
public class CF_easy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;      
        int sum = 0;    

        do {
            sum += i;   
            i++;        
        } while (i <= n);  

        System.out.println(sum);
	}

}
