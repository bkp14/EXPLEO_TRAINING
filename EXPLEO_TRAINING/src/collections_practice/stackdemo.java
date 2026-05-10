package collections_practice;
import java.util.Stack;
public class stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Stack <Integer> s = new Stack<>();
    System.out.println(s.capacity());
    System.out.println(s.size());
    s.add(1);
    s.add(2);
    s.add(3);
    s.add(4);
    s.add(6);
    s.add(1);
    s.add(2);
    s.add(3);
    s.push(4);
    System.out.println( s.pop());
    
    

	}

}
