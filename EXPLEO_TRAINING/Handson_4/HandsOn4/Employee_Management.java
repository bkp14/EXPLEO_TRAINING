package HandsOn4;
import java.util.*;
public class Employee_Management {
	private int empId;
	private String empName;
	
	
	public Employee_Management(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
		
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	boolean Checkin = false;
	public void markCheckIn(Employee_Attendance a) {
		if(a.getEmpid()==this.empId)
		a.markCheckIn();
		
	}
	public void markCheckOut(Employee_Attendance a) {
		a.markCheckOut();
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
