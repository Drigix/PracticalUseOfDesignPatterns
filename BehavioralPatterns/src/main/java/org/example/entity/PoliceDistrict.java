package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.IVisitor;
import org.example.interfaces.PoliceUnit;

@Getter
public class PoliceDistrict extends PoliceUnit {

    private String policeDistrictSurname = "Kowalski";
    private double surface = 100;

    public String getPoliceDistrictSurname() {
        return policeDistrictSurname;
    }

    public double getSurface() {
        return surface;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
