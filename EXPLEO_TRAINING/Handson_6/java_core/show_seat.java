package java_core;

public class show_seat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxseatcount = 10, seatcount=0;
		while(seatcount<maxseatcount) {
			System.out.println("cur seat avail "+maxseatcount);
			maxseatcount--;
		}
		System.out.println("seats are filled");

	}

}
