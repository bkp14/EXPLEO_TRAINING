package oops;

public class Employee {

    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    // Mark Check-In
    public void markCheckIn(Employee_Attendance a) {
        if (a.getEmpId() == this.empId) {
            a.markCheckIn();
        } else {
            System.out.println("Employee ID mismatch!");
        }
    }

    // Mark Check-Out
    public void markCheckOut(Employee_Attendance a) {
        if (a.getEmpId() == this.empId) {
            a.markCheckOut();
        } else {
            System.out.println("Employee ID mismatch!");
        }
    }
}
