package Handson_2;
import java.util.Scanner;
public class arr_easy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			int temp=0;
			for(int j=i+1;j<n;j++) {
				if(arr[j]>arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Max: "+arr[0]);
		System.out.println("Min: "+arr[n-1]);

	}

}
