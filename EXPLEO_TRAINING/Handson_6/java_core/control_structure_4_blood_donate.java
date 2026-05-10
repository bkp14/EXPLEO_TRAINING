package java_core;
import java.util.Scanner;
public class control_structure_4_blood_donate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
	    if(age>18) {
	    	int weight = sc.nextInt();
	    	if(weight>50) {
	    		System.out.println("you are eligible to donate blood");
	    	}
	    	else {
	    		System.out.println("you are under weight so you are not eligible to donate blood");
	    	}
	    }
	    	else {
	    		System.out.println("you are underage so you are not eligible to donate blood");
	    	}
	    sc.close();
	    }
	}


