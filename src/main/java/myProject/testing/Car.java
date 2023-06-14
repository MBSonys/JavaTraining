package myProject.testing;

public class Car extends Vechicle implements Estate, Coupe {
	
	public String color;
	
	
	public Car (String make, String model, int year, String color) {
		super(make, model, year);
		this.color = color;
	
	}
	
	public String getCarColor () {
		return color;
		
	}

	public void buyVechicle () {
		System.out.println("Car been bought from local seller");
	}
	
	public void createVechicle() {
		System.out.println("Class car created");
	};
	
	public void selectEstateType () {
		System.out.println("Car selected estate body type");
	} 
	
	public void selectCoupeType () {
		System.out.println("Car selected coupe body type");
	}
}
