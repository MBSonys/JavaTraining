package myProject.testing;

public interface Estate {
	
	static void estateType () {
		System.out.println("Car can have estate body type");
	}
	
	
	default void selectEstateType () {
		
	};
}
