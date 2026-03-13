package Handson_1;
import java.util.*;
public class CF_easy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        char ch = Character.toLowerCase(c);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                System.out.println("It is a Vowel.");
                break;

            default:
        
                if ( (ch >= 'a' && ch <= 'z')) {
                    System.out.println("It is a Consonant.");
                } else {
                    System.out.println("It is a Symbol.");
                }
        }

	}

}
