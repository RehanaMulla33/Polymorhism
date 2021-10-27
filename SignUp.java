package Polymorphism;

public class SignUp {
	String Email;
	String password;
	long phone_no;
	
	public SignUp() {
		System.out.println("For Login");
	}
	public void userSignUp(String Email,String password) {
		System.out.println("Inside the Email sign up method");
		System.out.println("Login Successful through email");
	}
	public void userSignUp(long phone_no,String password) {
		System.out.println("Inside the Phone sign up method");
		System.out.println("Login Successful through Phone number");
	}
}


