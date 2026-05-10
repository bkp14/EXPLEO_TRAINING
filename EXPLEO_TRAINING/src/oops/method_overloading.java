package oops;

public class method_overloading {
  static void add(int n1, int n2) {
	  System.out.println(n1+n2);
  }
  static void add(int n1, int n2,int n3) {
	  System.out.println(n1+n2+n3);
  }
  static void add(int n1, int n2,float n4) {
	  System.out.println((float)(n1+n2+n4));
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     add(1,2);
     add(1,2,3);
     add(1,2,76.6f);
	}

}
