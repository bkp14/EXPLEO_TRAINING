package Handson_2;
import java.util.Scanner;
public class ar_hard3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[4];
		int m=0;
		Scanner sc = new Scanner(System.in);
		while (true) {
		int n = sc.nextInt();
		if(n==-1) {
			break;
		}
		else {
			arr[m]=n;
			m++;
		}
		
		}
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]%8==0 && arr[i]%7==0) {
				arr[i]=-6;
			}
			 else if(arr[i]%7==0) {
				arr[i]=-2;
			}
			else if(arr[i]%8==0) {
				arr[i]=-9;
			}
			
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

}
