package Handson_3;

public class fun_easy2 {
  static void isprime(int i) {
	  boolean m =false;
	    for(int j=2;j<=Math.sqrt(i);j++) {
	    	if(i%j==0) {
	    		m = true;
	    	}
	    }
	    if(!m) {
	    	System.out.println(i);
	    }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int i=1;i<=100;i++) {
    	   isprime(i);
       }
	}

}
