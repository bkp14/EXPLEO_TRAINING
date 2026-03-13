package oops;
class parent {
	void work() {
		System.out.println("work from office");
	}
}
class child extends parent{
	void work() {
		super.work();
		System.out.println("work from home");
	}
}
public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent ob = new parent();
		ob.work();
		parent ob1 = new child();
		
		ob1.work();
	}

}
