package oops;
import java.util.Scanner;
public class Account {
	private String name;
	private String id;
	private int balance;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public int getBalance() {
		return balance;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

   Account (String id, String name, int balance){
	   this.name = name;
	   this.id = id;
	   this.balance=balance;
	   
   }
   Account (String id, String name){
	   this.name = name;
	   this.id = id;
	   balance=0;
   }
   int credit(int amount) {
	   balance+=amount;
	   return balance;
   }
   int debit(int amount) {
	   if(balance>=amount) {
		   balance-=amount;
		  
	   }
	   else {
		   System.out.println("amount exceeded balance");
		   
	   }
	   return balance;
   }
   int transferto(int amount) {
	   if(balance>=amount) {
		   balance-=amount;
		  
	   }
	   else {
		   System.out.println("amount exceeded balance");
		   return 0;
	   }
	   return balance;
   }
   public void transferTo(Account targetAccount, int amount) {
       if (balance >= amount) {
           this.balance -= amount;
           targetAccount.balance += amount;
           System.out.println("Transfer successful");
       } else {
           System.out.println("Insufficient balance for transfer");
       }
   }
   public void displayAccount() {
       System.out.println("---------------");
       System.out.println("Account ID   : " + id);
       System.out.println("Account Name : " + name);
       System.out.println("Balance      : " + balance);
       System.out.println("---------------");
   }
   public static void main(String args[]) {
	   Account acc1 = new Account("001","krishna",10000);
	   Account acc2 = new Account("002","prasath");
	   acc1.credit(1000);
	   System.out.println(acc2.debit(1000));
	   acc1.transferTo(acc2,500);
	   acc1.displayAccount();
       acc2.displayAccount();

   }
  
}


