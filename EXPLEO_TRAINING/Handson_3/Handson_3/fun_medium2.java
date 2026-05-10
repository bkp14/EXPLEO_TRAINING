package Handson_3;
import java.util.*;
public class fun_medium2 {
    static void prime(int s, int e) {
    	if(e>s) {
    	for(int i=s;i<=e;i++) {
    		if(isprime(i)) {
    		System.out.print(i+" ");
    		}
    	}
    	}
    	else {
    		System.out.println("enter valid input");
    	}
    }
    static boolean isprime(int i) {
    	
    	for(int j=2;j<=Math.sqrt(i);j++) {
    		if(i%j==0) {
    			return false;
    		}
    	}
    	
    	return true;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int n1=sc.nextInt();
		prime(n,n1);
	}

}
