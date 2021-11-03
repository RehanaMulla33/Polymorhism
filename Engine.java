package Polymorphism;

public class Engine {
	String type;
	int hp;
	int cc;
	int imei;
	
	public Engine(String type,	int hp,int cc,int imei) {
		System.out.println("Inside Engine");
		this.type=type;
		this.hp=hp;
		this.cc=cc;
		this.imei=imei;
	}
	public void start() {
		System.out.println("Engine started");
	}
	public void stop() {
		System.out.println("Engine stopped");
	}
}
