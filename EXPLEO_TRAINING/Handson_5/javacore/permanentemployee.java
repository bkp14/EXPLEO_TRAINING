package javacore;

public class permanentemployee extends employee {
	double bonus;
	permanentemployee(String empid, String empname, double basesalary, double bonus){
		super(empid,empname,basesalary);
		this.bonus = bonus;
	}
	public double calsalary() {
		return basesalary+bonus;
	}
}
