package org.example;

import org.example.entity.abacus.Abacus;
import org.example.instance.AbacusPool;
import org.example.instance.AbacusSingleton;

public class TestAbacus {
	public static void main(String[] args) {
		Abacus o1 = new Abacus();
		o1.count1();
		o1.count2();
		
		AbacusSingleton o2 = AbacusSingleton.getInstance();
		o2.count1();
		o2.count2();


		for(int i=1;i<=5;i++) {
			System.out.println("Attempt: "+i);
			AbacusPool o3 = AbacusPool.getInstance();
			if(o3!=null) {
				o3.count1();
				o3.count2();
				o3.free();
			}
			else {
				System.out.println("No free objects!");
			}
		}
		
	}
}
