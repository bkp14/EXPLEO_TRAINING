package Handson_2;
import java.util.Scanner;

public class arr_easy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int arr[][]=new int [n][c];
		int max =Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println(max);
		
	}

}
