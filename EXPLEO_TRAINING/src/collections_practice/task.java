package collections_practice;

import java.util.PriorityQueue;

public class task implements Comparable<task> {
	  private String name;
	  private int priority;
  public String getName() {
		return name;
	}


	  public int getPriority() {
		  return priority;
	  }


  public task(String name, int priority) {
		
		this.name = name;
		this.priority = priority;
  }
  
	@Override
	public int compareTo(task Other) {
		// TODO Auto-generated method stub
		return Integer.compare(Other.priority, this.priority);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  PriorityQueue<task> q = new PriorityQueue<>();
  q.add(new task("task 1",3));
  q.add(new task("task 2",1));
  q.add(new task("task 3",2));
while(q.isEmpty()) {
	task task1 = q.poll();
	System.out.println("executing: "+ task1.getName()+ " priority: "+task1.getPriority());
}
  
	}

}
