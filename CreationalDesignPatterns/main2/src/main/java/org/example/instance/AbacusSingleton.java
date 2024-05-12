package org.example.instance;

public class AbacusSingleton {

    private static final AbacusSingleton abacusSingleton = new AbacusSingleton();

    public static AbacusSingleton getInstance() {
        return abacusSingleton;
    }

    private AbacusSingleton() {}

    public void count1() {
        System.out.println("Do count1");
    }
    public void count2() {
        System.out.println("Do count2");
    }
}
