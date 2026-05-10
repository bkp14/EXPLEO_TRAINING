package javacore1;

public class NetBankingPayment extends payment {
	String bankName;
	String accountNumber;
	String ifscCode;
	public NetBankingPayment(String transactionId, double amount, String customerName,String bankName, String 
			accountNumber, String ifscCode) {
		super(transactionId, amount, customerName);
		// TODO Auto-generated constructor stub
		this.bankName=bankName;
		this.accountNumber = accountNumber;
		this.ifscCode=ifscCode;
	}
	boolean validatePayment() {
		if(accountNumber.length()>=8 && accountNumber.length()<=17&&ifscCode.length()==11) {
	     return true;
		}
		else {
			 return false;
		}
		}
		 boolean processPayment(){
			 if(validatePayment()) {
			 return true;
			 }
			 else {
				 return false;
			 }
		 }
}
