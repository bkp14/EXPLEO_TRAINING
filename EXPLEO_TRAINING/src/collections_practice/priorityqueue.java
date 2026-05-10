package collections_practice;

import java.util.PriorityQueue;

public class priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  PriorityQueue<String> q  = new  PriorityQueue<>();
  q.add("java");
  q.add("java");
  q.add("java");
  q.add("java");
  while(!q.isEmpty())
  {
	  System.out.println(q.poll());
	  }
  }

}
