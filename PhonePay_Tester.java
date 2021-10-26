package Polymorphism;

public class PhonePay_Tester {

	public static void main(String[] args) {
		Poly_PhonePay phonepay_recharge = new Poly_PhonePay();
		phonepay_recharge.recharge("Tata Sky", "Tata_67523", 1200);
		phonepay_recharge.recharge(9883337654L, 399);
		phonepay_recharge.recharge("D2H", 1800, "65@D2H");

	}

}
