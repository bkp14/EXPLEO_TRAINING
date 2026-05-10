package oops;
class base{
	base(){
		System.out.println("base const");
	}
}
class derived extends base{
	derived(int i){
		super();
		System.out.print(i +"derived const");
	}
}
public class inheritance_const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
derived ob = new derived(5);
	}

}
