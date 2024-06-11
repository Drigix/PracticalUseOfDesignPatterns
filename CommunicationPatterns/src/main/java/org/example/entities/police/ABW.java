package org.example.entities.police;

public class ABW extends PoliceUnit {

    @Override
    public void acceptTheReport(String report) {
        System.out.println("ABW: Obsługa meldunku "+ report);
    }
}
