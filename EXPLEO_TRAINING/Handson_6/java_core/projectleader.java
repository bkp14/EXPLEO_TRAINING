package java_core;

class pro {
String proleadname = "krishnaprasath";
int empid=24;
void display() {
	System.out.println(proleadname);
	System.out.println(empid);

	
}
}
class programmer extends pro{
	String progname;
	int empid;
	void setdata(String name,int id) {
	progname = name;
	empid = id;
	}
	void display() {
		super.display();
		
		System.out.println(progname);
		System.out.println(empid);
	  


	}
}
public class projectleader{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      programmer ob = new programmer();
      ob.setdata("kp", 1);
      ob.display();
	}
	}


