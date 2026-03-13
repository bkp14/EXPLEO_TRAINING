package HandsOn4;
import java.util.*;
public class Account_Management {
	String id;
	String name;
	int bal;
	public Account_Management(String id,String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public int credit(int amount) {
		bal+=amount;
		return bal;
	}
	public void debit(int amount) {
		if(amount<=bal) {
		bal-=amount;
		System.out.println(bal);
		}
		else {
			System.out.println("Amount exceeded");
		}
	}
	public int transfer(Account_Management a,int amount) {
		if(amount<=bal) {
			bal-=amount;
			a.bal+=amount;
		}
		else {
			System.out.println("Amount exceeded");
		}
		return bal;
		
	}
	void display(){
		System.out.println("Account details");
		System.out.println("Account holders name :"+name);
		System.out.println("Account holders id : "+id);
		System.out.println("Balance : "+bal);
	}
	public static void  main(String[] args) {
		Scanner s=new Scanner(System.in);
		Account_Management a=new Account_Management("M11","Muhindhar");
		Account_Management a2=new Account_Management("M22","Muthu");
		System.out.println("The credited amount : "+a.credit(5000));
		a.debit(2000);
		a.transfer(a2, 2000);
		a.display();
		a2.display();
	}
	
	
	
}

