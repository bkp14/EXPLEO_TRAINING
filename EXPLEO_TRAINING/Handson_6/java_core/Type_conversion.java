package java_core;

public class Type_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i=100;
          // implicit
          long l  = i;
          float f = l;
          double d = f;
          //explicit
          int j = (int)l;
          short s = (short)d;
          
          System.out.println(i);
          System.out.println(l);
          System.out.println(f);
          System.out.println(d);
          System.out.println(j);
          System.out.println(s);
	}

}
