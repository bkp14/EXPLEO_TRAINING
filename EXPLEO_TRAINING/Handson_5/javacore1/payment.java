package javacore1;

public abstract class payment {
String transactionId;
double amount;
String customerName;
String paymentStatus="pending";


public payment(String transactionId, double amount, String customerName) {
	
	this.transactionId = transactionId;
	this.amount = amount;
	this.customerName = customerName;
}
abstract boolean validatePayment();
abstract boolean processPayment() ;
void executeTransaction() {
	 if (validatePayment()) { 
		 if (processPayment()) { 
		 setPaymentStatus("Success") ;
		} else { 
		 setPaymentStatus("Failed") ;
		} 
		} else { 
		 setPaymentStatus("Validation Failed") ;
		} 
		 generateReceipt() ;
		} 

void generateReceipt() {
	System.out.println("transactionId: "+transactionId);
	System.out.println("amount: "+amount);
	System.out.println("customerName: "+customerName);
	System.out.println("paymentStatus: "+paymentStatus);

}
String getTransactionId() {
	return transactionId ;
}
double getAmount() {
	return amount;
}
String getPaymentStatus() {
	if(validatePayment()) {
		return "success";
	}
	else {
		return "fail";
	}
	
}
void setPaymentStatus(String status) {
	paymentStatus = status;
}
}
