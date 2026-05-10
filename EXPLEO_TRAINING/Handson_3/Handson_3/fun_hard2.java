package Handson_3;
import java.util.Scanner;
public class fun_hard2 {
  static String placement(int cs,int ec, int me) {
	  String res="null";
	  if(cs<0 || ec<0 || me<0) {
		  return "input in invalid";
	  }
		  //comparison
		  res=(cs==ec&&ec==me)?"None of the department has highest placement":(cs==ec && cs>me)?"Highest placement cs and ec":(ec==me&&ec>cs)?
			"Highest placement me and ec":(cs==me&&cs>ec)?"Highest placement cs and me":(cs>ec&&cs>me)?"Highest placement is cs":(ec>cs&&ec>me)?
			"Highest placement is ec":"Highest placement is me";
		  
	 
	  return res;
  }
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("students placed in cs: ");
			int n = sc.nextInt();
			System.out.print("students placed in ec: ");
			int n1 = sc.nextInt();
			System.out.print("students placed in me: ");
			int n2 = sc.nextInt();
			System.out.println(placement(n,n1,n2));
			sc.close();
		}
	}

}
