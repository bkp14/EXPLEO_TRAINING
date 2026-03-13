package oops;

public class this_keyword {
    int empid;
    String empname;
    double empsalary;

    // 1️⃣ Parameterized constructor
    this_keyword(int empid, String empname, double empsalary) {
        this.empid = empid;          // this.variable → distinguishes instance variable from parameter
        this.empname = empname;
        this.empsalary = empsalary;
        System.out.println("Employee record created successfully");
    }

    // 2️⃣ Default constructor calling parameterized constructor using this()
    this_keyword() {
        this(101, "KP", 20000);      // constructor chaining
        System.out.println("Default constructor called");
    }

    // 3️⃣ this.method() example
    void display() {
        this.empdetails();            // calling another method of the same class
    }

    void empdetails() {
        System.out.println("empid: " + empid);
        System.out.println("empname: " + empname);
        System.out.println("empsalary: " + empsalary);
    }

    // 4️⃣ Passing current object using method(this)
    void sendForProcessing() {
        HrDept hr = new HrDept();
        hr.processEmployee(this);     // passing current object
    }

    // 5️⃣ Returning current object (for method chaining)
    this_keyword updateSalary(double hikePercentage) {
        this.empsalary = empsalary + (empsalary * hikePercentage / 100);
        return this;                  // returns current object
    }

    this_keyword updateName(String newName) {
        this.empname = newName;
        return this;                  // returns current object
    }

    public static void main(String[] args) {
        // Constructor chaining example
    	this_keyword emp1 = new this_keyword();
        emp1.display();

        System.out.println();

        // Parameterized constructor
        this_keyword emp2 = new this_keyword(102, "Alice", 30000);
        emp2.display();

        System.out.println();

        // method(this) and passing object
        emp2.sendForProcessing();

        // method chaining example
        emp2.updateName("Alice Johnson").updateSalary(10).display();
    }
}

// HR department class
class HrDept {
    void processEmployee(this_keyword e) {
        System.out.println("HR Dept processing employee: ");
        System.out.println("Processed employee: " + e.empname + " with salary " + e.empsalary + "\n");
    }
}
