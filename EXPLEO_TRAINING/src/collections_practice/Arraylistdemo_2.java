package collections_practice;

import java.util.ArrayList;

public class Arraylistdemo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer> arr = new ArrayList<>();
         System.out.println("Initial size of array: "+arr.size());
         arr.add(10);
         arr.add(10);
         arr.add(10);
         arr.add(10);
         arr.add(10);
         System.out.println("size of array after changes : "+arr.size());
          Integer []ia =  new Integer[arr.size()];
          ia =arr.toArray(ia);
          int sum =0;
          for(int i: arr) {
        	  sum+=i;
          }
          System.out.println(sum);
          
	}

}
