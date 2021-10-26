package Polymorphism;

public class Googlepay_Tester {

	public static void main(String[] args) {
		GooglePay paybill = new GooglePay();
		paybill.bill_payment("Rehana", "67543MR564");
		paybill.bill_payment(988665432, 450);
		paybill.bill_payment("123@upi", 1500, 8123075643L);
		paybill.bill_payment(8362265634L, 999);

	}

}
