package myProject.testing;

public class ElectricCar extends Car {
	
	public String engineType;
	
	public ElectricCar (String make, String model, int year, String color, String engineType) {
		super(make, model, year, color);
		this.engineType = engineType;
		
	}
	
	public void desc() {
		System.out.println(make + " " + model + " " + year + " " + color + " " + engineType);
	}
	
	public void startEngine () {
		System.out.println("Engine started: bzzzzzz");
	}
	
	public String getCarColor () {
		return "This eletric car have color: " + color;
		
	}
	
	public void createVechicle() {
		System.out.println("Class ElectricCar created");
	};
}
	