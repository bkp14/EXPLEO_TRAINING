package collections_practice;
import java.util.*;
public class vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Vector<Integer> v = new Vector<>(10,5);
    System.out.println(v.size());
    v.add(1);
    v.add(2);
    v.add(3);
    v.add(4);
    v.add(6);
    v.add(1);
    v.add(2);
    v.add(3);
    v.add(4);
    v.add(2);
    v.add(3);
    v.add(4);
    v.add(2);
    v.add(3);
    v.add(4);
    v.add(4);
    System.out.println(v.size());
    System.out.println(v.get(1));
    System.out.println(v.capacity());


	}

}
