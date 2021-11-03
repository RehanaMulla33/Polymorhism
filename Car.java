package Polymorphism;

public class Car {
	String color;
	int price;
	String brand;
	
	Engine engine=new Engine("Engine",1300,120,145);
	
	public void travel() {
		engine.start();
		System.out.println("Travelling");
		engine.stop();
	}
	
	

}
