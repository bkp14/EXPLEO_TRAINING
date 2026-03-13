package generics;
import java.util.*;
public class Wildcards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> ints = new ArrayList<>();
     ints.add(10);
     ints.add(20);
     ints.add(30);
     ints.add(40);
  double sum = sum(ints);
  System.out.println("sum of ints: "+sum);
     
	}
	public static double sum(List<? extends Number> list) {
		
		double sum =0;
		for(Number n: list) {
			sum+= n.doubleValue();
		}
		return sum;
	}

}
