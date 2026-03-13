package Handson_1;
import java.util.Scanner;
public class CF_medium8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		//char ch[] = s.toCharArray();
		int l=0,d=0,sp=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				l++;
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				d++;
			}
			else {
				sp++;
			}
		}
		System.out.println("letters: "+l);
		System.out.println("digits: "+d);
		System.out.println("other symbols: "+sp);

	}

}
