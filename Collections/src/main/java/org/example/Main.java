package org.example;

import org.example.entity.Car;
import org.example.entity.Item;
import org.example.entity.Location;
import org.example.entity.Warehouse;
import org.example.interfaces.IComponent;
import org.example.services.ComponentIterator;
import org.example.services.FlyweightPool;

public class Main {
    public static void main(String[] args) {
//        IComponent s = new Location("Polska");
//        Location l = new Location("Kraków");
//        s.addElement(l);
//        l.addElement(new Car("Fiat"));
//        l.addElement(new Car("Opel"));
//        l = new Location("Warszawa");
//        l.addElement(new Car("Mercedes"));
//        s.addElement(l);
//        s.addElement(new Car("Ford"));
//        s.writeInfo();
//        ComponentIterator componentIterator = new ComponentIterator(s);
//        s.writeInfo();
//        while(componentIterator.hasNext()) {
//            componentIterator.getNext().writeInfo();
//        }
        Runtime.getRuntime().gc();
        Warehouse[] warehouses = new Warehouse[100];
        for(int i = 0; i < warehouses.length; i++) {
            warehouses[i] = new Warehouse();
            for(int j = 0; j < 20; j++)
                warehouses[i].addItem(FlyweightPool.getItem("art"+j, j));
//                magazyny[i].addItem(new Item("art"+j,j));
        }
        for(Warehouse m: warehouses)
            for(Item a:m.getItems())
                System.out.println(a.getName()+" "+a.getPrice());


        Long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(usedMemory);
    }
//    Fiat 1
//    Opel 1
//    Kraków 2
//    Mercedes 1
//    Warszawa 1
//    Ford 1
//    Polska 4
}