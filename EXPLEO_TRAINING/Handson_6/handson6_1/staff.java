package handson6_1;

public class staff extends person {
String school;
double pay;
public staff(String name, String address, String school, double pay) {
	super(name, address);
	this.school = school;
	this.pay = pay;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public double getPay() {
	return pay;
}
public void setPay(double pay) {
	this.pay = pay;
}
@Override
public String toString() {
	return "staff [name=" + name + ", address=" + address + ", school=" + school + ", pay=" + pay + "]";
}



}
