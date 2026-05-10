package HandsOn_10_2;
import java.util.*;
import java.util.Set;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Set <String> s = new LinkedHashSet<>();
   Scanner sc = new Scanner(System.in);
   while(true) {
	   System.out.print("enter the element: ");
	   String input = sc.nextLine();
	   if(input.equalsIgnoreCase("stop")) {
		   break;
	   }
	   
	 s.add(input);
   }
   Iterator<String> it = s.iterator();
   String  value = "";
   while(it.hasNext()) {
	   value += it.next()+" ";
   }
   System.out.print("Concatenated result: "+value);
	}

}
