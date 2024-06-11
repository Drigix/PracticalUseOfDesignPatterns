package org.example.entities.police;

public class MainPoliceDepartment extends PoliceUnit {

    @Override
    public void acceptTheReport(String report) {
        System.out.println("KG: Obsluguję meldunek "+ report);
    }
}
