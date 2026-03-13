package java_core;

public class control_structure_1 {
  static boolean ismoving=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int cs=10;
     if(ismoving) {
    	 cs--;
    	 System.out.print("the cycle speed has reduced");
     }
     else {
    	 System.out.println("the cycle has stopped");
     }
     
	}

}
