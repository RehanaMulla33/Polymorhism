package Polymorphism;

public class Printer {
	int size;
	int firstIndex;
	int lastIndex;

	public Printer() {
		System.out.println("The Printer operations");
	}

	public void print() {
		System.out.println("Inside print method");
		System.out.println("Print the document by defautl setting values");
	}

	public void print(int size) {
		System.out.println("Inside print method");
		System.out.println("Print the document according to the given values" + size);
	}

	public void print(int firstIndex, int lastIndex) {
		System.out.println("Inside print method");
		System.out.println("Print the document from " + firstIndex + "to" + lastIndex);
	}

}
