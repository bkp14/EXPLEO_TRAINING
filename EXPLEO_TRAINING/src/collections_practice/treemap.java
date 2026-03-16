package collections_practice;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeMap<String,Double> tm = new TreeMap<>();
		  System.out.println("size of hashmap before insertion: "+tm.size());
			tm.put("tamil1", 20.9);
			tm.put("tamil3", 21.9);
			tm.put("tamil3", 22.9);
			tm.put("tamil6", 23.9);
			tm.put("tamil5", 24.9);
			tm.put("tamil4", 25.9);
			tm.put("tamil7", 26.9);
			System.out.println(tm);
			  System.out.println("size of hashmap after insertion: "+tm.size());
		        Set<Map.Entry<String,Double >> set = tm.entrySet();
		        for(Map.Entry<String,Double> me: set) {
		        	System.out.print(me.getKey()+" ");
		        	System.out.println(me.getValue());
		        }
	}

}
