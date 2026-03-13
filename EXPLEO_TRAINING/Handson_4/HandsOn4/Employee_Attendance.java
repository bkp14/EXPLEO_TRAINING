package HandsOn4;
import java.util.*;
import java.time.LocalTime;
public class Employee_Attendance{
	private int empid;
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	private String empName;
	private  LocalTime checkintime;
	private LocalTime checkouttime;
	
	Employee_Attendance(int empid,String empName){
		this.empid = empid;
		this.empName = empName;
	}
	
	boolean markCheckIn=false;
	public void markCheckIn() {
		if(!markCheckIn) {
			  checkintime = LocalTime.now();
		     System.out.println("Checkin Time: " + checkintime);
		     markCheckIn = true;
		}
		else {
			System.out.println("Please checkin to mark "
					+ "the attendance");
		}
	}
	boolean markCheckOut = false;
	public void markCheckOut() {
		if(markCheckIn) {
			  checkouttime = LocalTime.now();
		     System.out.println("Checkout Time: " + checkouttime);
		     markCheckOut = true;
		}	
		else {
			System.out.println("Please checkout to mark "
					+ "the attendance");
		}
	}
	
	public void  getDet() {
		System.out.println("Employee Id : "+ empid);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee CheckIn time : "+checkintime);
		System.out.println("Employee CheckOut time : "+checkouttime);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
