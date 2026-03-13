package javacore1;

public class UPIPayment extends payment {
	String upiId;
	String upiPin;
	public UPIPayment(String transactionId, double amount, String customerName, String upiId,
			String upiPin) {
		super(transactionId, amount, customerName);
		this.upiId = upiId;
		this.upiPin = upiPin;
	}
	boolean validatePayment() {
	     if(upiId.contains("@")&& upiPin.length()==4) {
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
