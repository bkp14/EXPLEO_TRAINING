package Handson_7_1;
import java.util.*;
public class duplicate_removal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   String s = sc.nextLine();
   boolean arr[]=new boolean[s.length()];
   for(int i=0;i<s.length();i++) {
	   if(arr[i]==true) {
		   continue;
	   }
	   else {
	   for(int j=i+1;j<s.length();j++) {
		   
		   if(s.charAt(i)==s.charAt(j)) {
			 
			   arr[j]=true;
		   }
	   }
	   }
   }
   for(int i=0;i<s.length();i++) {
	   if(arr[i]==false) {
		   System.out.print(s.charAt(i));
	   }
   }
   
	}

}
