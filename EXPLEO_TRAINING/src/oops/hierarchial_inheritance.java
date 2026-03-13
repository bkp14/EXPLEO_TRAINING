package oops;
class person{
	String name;
	String address;
	person(String name, String address){
		this.name=name;
		this.address=address;
	}
	String getname() {
		return name;
	}
	String getaddress() {
		return address;
	}
	void setaddress(String address) {
		this.address=address;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}
	
}
class student extends person{
	String program ;
	int year;
	double fee;
	student(String name,String address,String program,int year,double fee){
	    super(name,address);
	    this.program=program;
	    this.year=year;
	    this.fee=fee;
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
		return "student [name =" +name+ ",address =" +name+ ",program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
	
}
class staff extends person{
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
		return "staff [school=" + school + ", pay=" + pay + ", name=" + name + ", address=" + address + "]";
	}
 
	
}
public class hierarchial_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			staff ob = new staff("krishna","kennady nagar","vidya mandir",300.00);
			System.out.print(ob);
			
	}

}
