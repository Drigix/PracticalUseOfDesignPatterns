package entity.ingredient;

public class Pasta extends Ingredient {

	@Override
	public String toString() {
		return "pasta";
	}
	
	public void cook() {
		System.out.println("Cook pasta");
	}
	
}
