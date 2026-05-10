package Handson_7_4;
import java.util.Scanner;

public class encryption {
	
   static void Encrypt(String s) {
	   char ch;
	   
	    for(int i=0;i<s.length();i++) {
	    	
	    	if(Character.isLetter(s.charAt(i))) {
	    		
	    		if((int)s.charAt(i)>=65&&(int)s.charAt(i)<=90) {
	    			
	    			if((int)s.charAt(i)<=87) {
	    				ch =(char)(s.charAt(i)+3);
	    			}
	    			else {
	    				ch=(char)(s.charAt(i)-23);
	    			}
	    		}
	    		else {
	    			if((int)s.charAt(i)<120) {
	    				ch =(char)(s.charAt(i)+3);
	    			}
	    			else {
	    				ch=(char)(s.charAt(i)-23);
	    			}
	    		}
	    		
	    		System.out.print(ch);
	    	}
	    	
	    	else if(Character.isDigit(s.charAt(i))) {
	    		System.out.print(s.charAt(i));
	    	}
	    	else if(s.charAt(i)==' ') {
	    		System.out.print("_");
	    	}
	    	else {
	    		System.out.print(s.charAt(i));
	    	}
	    }
   }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Encrypt(sc.nextLine());
	}
}