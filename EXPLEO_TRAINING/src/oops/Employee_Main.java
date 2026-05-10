package oops;

public class Employee_Main {
    public static void main(String[] args) {

        Employee m = new Employee(1,"Muhindhar");
        Employee_Attendance a = new Employee_Attendance(1,"kp");

        m.markCheckIn(a);
        m.markCheckOut(a);

        a.getDetails();
    }
}
