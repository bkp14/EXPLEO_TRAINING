package Handson_2;
import java.util.*;
public class arr_medium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++) {
	  arr[i]= sc.nextInt();
  }
  boolean k=false;
  int key = sc.nextInt();
  for(int i=0;i<n;i++) {
	  if(arr[i]==key) {
		 k=true;
	  }
	  
  }
  if(k) {
	  System.out.println(true);
  }
  else {
	  System.out.println(false);

  }
  
	}

}
