package handson6_1;

public class person {
String name;
String address;
public person(String name, String address) {
	this.name = name;
	this.address = address;
}
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "person [name=" + name + ", address=" + address + "]";
}

}
