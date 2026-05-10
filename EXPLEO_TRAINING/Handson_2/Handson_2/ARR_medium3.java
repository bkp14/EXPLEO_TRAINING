//program to count a total number of duplicate and unique elements in the given array.
package Handson_2;
import java.util.Scanner;
public class ARR_medium3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0,count1=0;
		boolean visited[] = new boolean[n];
		for(int i=0;i<n;i++) {
			if(visited[i]) {
				continue;
			}
			 
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				else if(arr[i]!=arr[j]) {
					count1++;
				}
			}
		}
		System.out.println("unique elements: "+ count1);
		System.out.println("duplicate elements: "+ count);

		
				
	}

}
