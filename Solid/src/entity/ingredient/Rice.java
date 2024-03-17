package entity.ingredient;

public class Rice extends Ingredient {

    @Override
    public String toString() {
        return "rice";
    }

    public void cook() {
        System.out.println("Cook rice");
    }
}
