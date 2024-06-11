package org.example.entities.police;

public class District extends PoliceUnit {

    @Override
    public void acceptTheReport(String report) {
        System.out.println("Dzielnicowy: Obsługa meldunku "+ report);
    }
}
