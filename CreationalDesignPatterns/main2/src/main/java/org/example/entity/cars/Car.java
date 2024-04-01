package org.example.entity.cars;

public class Car implements ICar {
	public void fuelUp() {
		System.out.println(this+" Fuel up Car ");
	}
	public void checkFluids() {
		System.out.println(this+" Check fluids Car ");
	}
	public void test() {
		System.out.println("Car "+this+" ready");
	}
	
}


