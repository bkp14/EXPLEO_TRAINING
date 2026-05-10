package Handson_2;
import java.util.Arrays;
import java.util.Scanner;
public class arr_hard4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ind[] = new int[n];
		int n1 = sc.nextInt();
		int nri[] = new int[n1];
		int n2 = sc.nextInt();
		int fore[] = new int[n2];
		int size = n+n1+n2;
		 int arr[ ] = new int[size];
		 for(int i=0;i<n;i++) {
			 ind[i]=sc.nextInt();
		 }
		 for(int i=0;i<n1;i++) {
			 nri[i]=sc.nextInt();
		 }
		 for(int i=0;i<n2;i++) {
			 fore[i]=sc.nextInt();
		 }
		 for(int i=0;i<size;i++) {
			 if(i<n) {
				 arr[i]=ind[i];
			 }
			 else if(i>=n&&i<n1+n) {
				 arr[i]=nri[i-n];

			 }
			 else if(i>=n1+n&&i<n2+n1+n) {
				 arr[i]=fore[i-(n+n1)];
			 }
		 }
		 Arrays.sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
