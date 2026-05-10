package Handson_3;
import java.util.Scanner;
public class funu_easy1 {
   void add(int arr[]) {
	   int even=0,odd=0;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]%2==0) {
			   even+=arr[i];
		   }
		   else {
			   odd+=arr[i];
		   }
	   }
	   System.out.println("even sum: "+even);
	   System.out.println("odd sum: "+odd);

   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		funu_easy1 ob = new funu_easy1();
		ob.add(arr);
		
		
	}

}
