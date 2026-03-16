package collections_practice;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub\
			ArrayList <String> arr = new ArrayList<>();
			System.out.println("Initial size of array : "+arr.size());
			arr.add("a");
			arr.add("b");
			arr.add("c");
			arr.add("d");
			System.out.println("Size of array : "+arr.size());
			arr.remove("d");
			System.out.println("Array after rem d"+arr);
			arr.remove(2);
			System.out.println("Array after removing 2 pos : "+arr);
		
	}

}
