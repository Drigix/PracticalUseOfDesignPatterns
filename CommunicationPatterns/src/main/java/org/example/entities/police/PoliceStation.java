package org.example.entities.police;

public class PoliceStation extends PoliceUnit {

    @Override
    public void acceptTheReport(String report) {
        System.out.println("Posterunek: Obsluguję meldunek "+ report);
    }
}
