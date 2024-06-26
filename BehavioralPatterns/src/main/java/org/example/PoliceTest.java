package org.example;

import org.example.entity.ABW;
import org.example.entity.MainPoliceDepartment;
import org.example.entity.PoliceDepartment;
import org.example.entity.PoliceDistrict;
import org.example.interfaces.PoliceUnit;

import java.util.ArrayList;
import java.util.List;

public class PoliceTest {

    public static void main(String[] args) {
        List<PoliceUnit> units = new ArrayList<>();

        units.add(new PoliceDistrict());
        units.add(new PoliceDepartment());
        units.add(new MainPoliceDepartment());
        units.add(new ABW());

        writeBoss(units);
        writeSurface(units);
    }

    public static void writeBoss(List<PoliceUnit> units) {
        System.out.println("Bosses of the units");
        for(PoliceUnit unit: units) {
            if(unit instanceof PoliceDistrict) {
                System.out.println("Police district: " + ((PoliceDistrict) unit).getPoliceDistrictSurname());
            }
            if(unit instanceof PoliceDepartment) {
                System.out.println("Police department: " + ((PoliceDepartment) unit).getCommanderSurname());
            }
            if(unit instanceof MainPoliceDepartment) {
                System.out.println("Main police department: " + ((MainPoliceDepartment) unit).getCommander());
            }
            if(unit instanceof ABW) {
                System.out.println("ABW: Not to write!");
            }
        }
    }

    public static void writeSurface(List<PoliceUnit> units) {
        System.out.println("Surface of the units");
        for(PoliceUnit unit: units) {
            if(unit instanceof PoliceDistrict) {
                System.out.println("Police district: " + ((PoliceDistrict) unit).getSurface());
            }
            if(unit instanceof PoliceDepartment) {
                System.out.println("Police department: " + ((PoliceDepartment) unit).getLength() + ((PoliceDepartment) unit).getWidth());
            }
            if(unit instanceof MainPoliceDepartment) {
                System.out.println("Main police department: " + ((MainPoliceDepartment) unit).getArea());
            }
            if(unit instanceof ABW) {
                System.out.println("ABW: All country");
            }
        }
    }
}
