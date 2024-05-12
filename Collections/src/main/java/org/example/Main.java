package org.example;

import org.example.entity.Car;
import org.example.entity.Location;
import org.example.interfaces.IComponent;
import org.example.services.ComponentIterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("START");
        IComponent s = new Location("Polska");
        Location l = new Location("Kraków");
        s.addElement(l);
        l.addElement(new Car("Fiat"));
        l.addElement(new Car("Opel"));
        l = new Location("Warszawa");
        l.addElement(new Car("Mercedes"));
        s.addElement(l);
        s.addElement(new Car("Ford"));
//        s.writeInfo();
        ComponentIterator componentIterator = new ComponentIterator(s);
        while(componentIterator.hasNext()) {
            componentIterator.getNext().writeInfo();
        }
        System.out.println("STOP");
    }
//    Fiat 1
//    Opel 1
//    Kraków 2
//    Mercedes 1
//    Warszawa 1
//    Ford 1
//    Polska 4
}