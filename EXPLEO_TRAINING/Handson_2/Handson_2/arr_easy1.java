package Handson_2;
import java.util.*;
public class arr_easy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[5];
		int arr1[]= new int[5];
		int k=1,m=0,n1=0;
	    for(int i=0;i<n;i++) {
	    	
	    	if(k%2==0) {
	    		arr[m++]=k;
	    	}
	    	else {
	    		arr1[n1++]= k;
	    	}
	    	k++;
	    }
	    System.out.println("even: "+Arrays.toString(arr));
	    System.out.println("odd: "+Arrays.toString(arr1));

	}

}
