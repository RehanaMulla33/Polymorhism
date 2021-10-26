package Polymorphism;

public class Poly_PhonePay {
	String name;
	long mobile_no;
	String subscriber_ID;
	String provider;
	int amount;
	String TV_operator;

	public Poly_PhonePay() {
	}

	public void recharge(long mobile_no, int amount) {
		System.out.println(" Mobile recharge of an" + amount + " is successful");
	}

	public void recharge(String provider, int amount, String subsciber_ID) {
		System.out.println(" DTH recharge of" + amount + "is successful");
	}

	public void recharge(String TV_operator, String subscriber_ID, int amount) {
		System.out.println(" Cable TV of " + TV_operator + " an amount of" + amount + "recharge is successful");
	}
}
