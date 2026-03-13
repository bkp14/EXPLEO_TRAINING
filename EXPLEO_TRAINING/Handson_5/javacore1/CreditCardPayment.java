package javacore1;

public class CreditCardPayment extends payment {
	String cardNumber;
	 String cvv;
	 String expiryDate;
	public CreditCardPayment(String transactionId, double amount, String customerName,
			String cardNumber, String cvv, String expiryDate) {
		super(transactionId, amount, customerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}
	boolean validatePayment() {
		if(cardNumber.length() ==16&&cvv.length()==3) {
     return true;
	}
		else {
			return false;
		}}
	 boolean processPayment(){
		 if(validatePayment()) {
		 return true;
		 }
		 else {
			 return false;
		 }
	 }

	 
}
