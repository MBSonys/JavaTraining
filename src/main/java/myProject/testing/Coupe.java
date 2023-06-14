package myProject.testing;

public interface Coupe {
	
	
	static void coupeType () {
		System.out.println("Car can have coupe body type");
	}
	
	
	default void selectCoupeType () {
		
	}
}
