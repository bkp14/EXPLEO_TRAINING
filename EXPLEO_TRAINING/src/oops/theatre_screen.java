package oops;

public class theatre_screen {

	private static int totalseats=20;
	theatre_screen(){
		System.out.println("total seats available: "+totalseats);
	}
	public void displaytheatrescreen() {
		System.out.println("current seats available: "+totalseats);

	}
	public static void bookticket(int nooftickets) {
		System.out.println("total seats booked: "+nooftickets);
			totalseats-=nooftickets;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bookticket(10);
		theatre_screen ob = new theatre_screen();
		ob.displaytheatrescreen();
		theatre_screen.bookticket(11);
		ob.displaytheatrescreen();

	}

}
