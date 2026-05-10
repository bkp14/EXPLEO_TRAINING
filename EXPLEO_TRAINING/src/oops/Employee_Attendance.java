package oops;

import java.time.LocalTime;

public class Employee_Attendance {

    private int empId;
    private String empName;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;

    private boolean checkedIn = false;

    public Employee_Attendance(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void markCheckIn() {
        if (!checkedIn) {
            checkInTime = LocalTime.now();
            System.out.println("Check-in Time: " + checkInTime);
            checkedIn = true;
        } else {
            System.out.println("Already checked in!");
        }
    }

    public void markCheckOut() {
        if (checkedIn) {
            checkOutTime = LocalTime.now();
            System.out.println("Check-out Time: " + checkOutTime);
            checkedIn = false;
        } else {
            System.out.println("Please check in first!");
        }
    }

    public void getDetails() {
        System.out.println("Employee Id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Check-in Time : " + checkInTime);
        System.out.println("Check-out Time : " + checkOutTime);
    }
}
