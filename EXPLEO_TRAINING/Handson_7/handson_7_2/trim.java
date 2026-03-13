package handson_7_2;
import java.util.Scanner;

public class trim {
    static void mytrim(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == ' ') {
                l++;
            } else {
                break;
            }
        }

        for(int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                r--;
            } else {
                break;
            }
        }

        System.out.println(s.substring(l, r + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mytrim(sc.nextLine());
    }
}