package Handson_2;
import java.util.*;
public class arr_easy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int arr1[]= new int[n1];
		int arr2[]= new int[n2];
		int arr3[]= new int[n1+n2];

		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n1+n2;i++) {
			if(i<n1) {
				arr3[i]=arr1[i];
			}
			else {
				arr3[i]=arr2[i-n1];
			}
		}
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println("");
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		System.out.println("");

		for(int i:arr3) {
			System.out.print(i+" ");
		}
		

		
			
	}
}
