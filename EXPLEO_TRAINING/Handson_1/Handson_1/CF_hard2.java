package Handson_1;
import java.util.Scanner;
public class CF_hard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double tot=0;
		int sum=0,i=0;
		while(true) {
			
			System.out.println("enter exam grade(0-10)");
			int eg = sc.nextInt();
			System.out.println("enter exercise grade(0-10)");
         
			int exg = sc.nextInt();
			if(eg<=10 &&eg>=-1&& exg >=-1&&exg<=10) {
			if(eg>=5 && exg >=5) {
				tot = (eg*0.7)+(exg*0.3);
				
			}
			
			else if(eg==-1 && exg==-1) {
				break;
			}
			else {
				tot=eg+exg;
			}
			sum+=(int)tot;
			i++;
			
		}
			else {
				System.out.println("enter valid grade");
			}
		}
		System.out.println(sum/(i-1));

		
		
		
	
	}

}
