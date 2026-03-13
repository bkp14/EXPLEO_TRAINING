package java_core;

public class test_generic {
    static <T> void genericdisplay (T element) {
    	System.out.println(element);
    	System.out.print(element.getClass().getName()+"="+element);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       genericdisplay(11);
       genericdisplay("TEST");
       genericdisplay(1.0);
	}

}
