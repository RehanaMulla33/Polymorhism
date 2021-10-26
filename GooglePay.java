package Polymorphism;

public class GooglePay {
	String name;
	String creditcard_no;
	long  mobile_no;
	String UPI_ID;
	long telephone_no;
	int amount;
	int customer_id;
	
	public GooglePay() {
	
	}

	public void bill_payment(String name, String creditcard_no) {
		System.out.println("Credit card  payment of" +creditcard_no+   "is successful");
	}

	public void bill_payment(int mobile_no, int amount) {
		System.out.println(" Mobile recharge of " +amount+ "is successful");
	}

	public void bill_payment(String UPI_ID, int amount,long mobile_no) {
		System.out.println(" Payment of Rs" +amount+" to"+mobile_no+ "@upi is successful");
	}

	public void bill_payment(long telephone_no, int amount) {
		System.out.println("An amount of"+amount+ " of telephone_no" +telephone_no+ "jio fiber connection recharge is successful");
	}

	public void bill_payment(int customer_id, String name) {
		System.out.println("Water bill payment  is successful");
	}
}
