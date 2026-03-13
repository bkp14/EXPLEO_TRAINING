package oops;
class hi{
	 static double pi = 3.14;
	 static void mate(double pi) {
		hi.pi=pi;
		System.out.print(pi);
	}
}
public class final_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   hi.mate(0);
	}

}
