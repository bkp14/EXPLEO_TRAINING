package collections_practice;

import java.util.ArrayList;
import java.util.Spliterator;

public class splititer {

	
		// TODO Auto-generated method stub
	    public static void main(String[] args) {

	        ArrayList<Double> arr = new ArrayList<>();

	        System.out.println("Size : " + arr.size());

	        arr.add(1.0);
	        arr.add(2.0);
	        arr.add(3.0);
	        arr.add(4.0);
	        arr.add(5.0);
	        arr.add(6.0);

	        System.out.println("Contents of ArrayList using tryAdvance");

	        Spliterator<Double> sitr = arr.spliterator();

	        while(sitr.tryAdvance(n -> System.out.println(n + " ")));

	        System.out.println();

	        System.out.println("Contents of ArrayList using forEachRemaining");

	        sitr = arr.spliterator();

	        sitr.forEachRemaining(n -> System.out.println(n + " "));

	        System.out.println();

	        System.out.println("Size of ArrayList after insertion is : " + arr.size());
	    }
	

}
