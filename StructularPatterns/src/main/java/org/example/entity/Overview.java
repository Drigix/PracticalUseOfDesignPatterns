package org.example.entity;


public class Overview {
	private void changeOil(Car s) {
		System.out.println("Change oil in "+s);
	}
	private void changeSparkPlugs(Car s) {
		System.out.println("Change spark plugs in "+s);
	}
	private void changeFilters(Car s) {
		System.out.println("Change filters in "+s);
	}

	public void makeOverview(Car s) {
		System.out.println("Starting car overview "+s);
		changeOil(s);
		changeSparkPlugs(s);
		changeFilters(s);
		System.out.println("Overview car "+s+" end");
	}
}

