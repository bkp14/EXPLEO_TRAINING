package collections_practice;
import java.util.LinkedList;
public class LL_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedList<String> ll = new LinkedList<>();
   System.out.println(ll.size());
   ll.add("java");
   ll.add("c++");
   ll.add("c");
   ll.add("js");
   ll.add("python");
   System.out.println(ll.size());
   for(String i: ll) {
	   System.out.print(i+" ");
   }
   System.out.println("");

  
   ll.add(1,"ruby");
   ll.removeLastOccurrence(ll);
   ll.replaceAll(k->" hello");
   System.out.println(ll);
	}
	  

}
