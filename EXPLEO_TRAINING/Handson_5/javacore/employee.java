package javacore;

class employee{
	String empid;
	String empname;
	double basesalary;
	employee(){
		
	}
	employee(String empid, String empname, double basesalary){
		this.empid=empid;
		this.empname=empname;
		this.basesalary=basesalary;
		
	}
	employee(String empid, String empname){
		this.empid=empid;
		this.empname=empname;
		
		
	}
	
	public String getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public double getBasesalary() {
		return basesalary;
	}
	public double calsalary() {
		return basesalary;
	}

	@Override
	public String toString() {
		return "employee [empid=" + empid + ", empname=" + empname + ", basesalary=" + basesalary + "]";
	}
}