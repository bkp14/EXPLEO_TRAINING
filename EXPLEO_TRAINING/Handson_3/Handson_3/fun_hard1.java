package Handson_3;
import java.util.*;
public class fun_hard1 {

	static void increement(int salary,float appraisal) {
		if(appraisal>=1&& appraisal<=10 && salary>0) {
			if(appraisal>=1&&appraisal<=4) {
				double amount = salary+(salary*0.10);
				System.out.println((int)amount);
			}
			else if(appraisal>=4.1&&appraisal<=7) {
				double amount = salary+(salary*0.25);
				System.out.println((int)amount);
			}
			else if(appraisal>=7.1&&appraisal<=10) {
				double amount = salary+(salary*0.30);
				System.out.println((int)amount);
			}
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Salaray: ");
		int n= sc.nextInt();
		System.out.print("Enter the appraisal: ");
		float n1= sc.nextFloat();
		
		increement(n,n1);
	}

}
