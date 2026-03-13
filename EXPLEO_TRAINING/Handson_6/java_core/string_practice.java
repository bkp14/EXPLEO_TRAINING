package java_core;

public class string_practice {
	static String s4;
    public static void concat1(String s1) {
    	s4=s1+"ram";
    	
    	
    }
    public static void concat2(StringBuilder s2) {
    	s2.append("raj");
    	
    }
    public static void concat3(StringBuffer s3) {
    	s3.append("ravi");
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1 = "hello ";
      concat1(s1);
      System.out.println(s4);
      
       StringBuilder s2 = new StringBuilder("hello,");
       concat2(s2);
       System.out.println(s2);
       StringBuffer s3 = new StringBuffer("hello,");
       concat3(s3);
       System.out.println(s3);

	}

}
