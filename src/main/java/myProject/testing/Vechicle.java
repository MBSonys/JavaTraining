package myProject.testing;

public abstract class Vechicle {
	
	public String make;
	public String model;
	public int year;
	
	public Vechicle (String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public abstract void createVechicle();
	
	public void unlockCar () {
		System.out.println("Car: " + make + " " + model + " has been unlocked");
	}
	
	public int getHowOldIsCar (int presentYear) {
		return presentYear - year;
	}
	
	public void buyVechicle () {
		System.out.println("Vechicle been bought from dealer");
	}
}
