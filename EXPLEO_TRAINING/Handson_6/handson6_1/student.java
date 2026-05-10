package handson6_1;

public class student extends person {
String program;
int year;
double fee;
public student(String name, String address, String program, int year, double fee) {
	super(name, address);
	this.program = program;
	this.year = year;
	this.fee = fee;
}
public String getProgram() {
	return program;
}
public void setProgram(String program) {
	this.program = program;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
@Override
public String toString() {
	
	return "student [name=" + name + ", address=" + address + ", program=" + program + ", year=" + year + ", fee=" + fee
			+ "]";
}



}
