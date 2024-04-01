package org.example.entity.cars;

public class Truck implements ICar {
	public void fuelUp() {
		System.out.println(this+" Fuel up Truck ");
	}
	public void checkFluids() {
		System.out.println(this+" Check fluids Truck");
	}
	public void test() {
		System.out.println("Truck "+this+" ready");
	}
}
