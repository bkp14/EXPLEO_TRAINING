package HandsOn4;
import java.util.*;
public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee_Management m = new Employee_Management(1,"Muhindhar");
		Employee_Attendance a = new Employee_Attendance(1,"Muthu");
		m.markCheckIn(a);
		m.markCheckOut(a);
		a.getDet();
	}

}
