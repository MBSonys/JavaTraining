package myProject.testing;


public class TestingApplication {
	
	
	static void callSuperMethod(Vechicle myVechicle) {
		myVechicle.unlockCar();
	};

	public static void main(String[] args) {
		
		Vechicle newCar = new ElectricCar("Mercedes Benz", "EQS", 2021, "Black", "EV");
		
		Vechicle[] instanceList = {
				new ElectricCar("Mercedes Benz", "EQS", 2022, "White", "EV"),
				new ElectricCar("Mercedes Benz", "EQC", 2019, "Red", "Petrol"),
				new ElectricCar("Mercedes Benz", "GLB", 2020, "Yellow", "Diesel")
						};
		
		
		callSuperMethod(newCar);
		
		for (Vechicle i : instanceList ) {
			callSuperMethod(i);
		}
		
		
		
	}

}
