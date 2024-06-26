package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.IVisitor;
import org.example.interfaces.PoliceUnit;

import java.awt.*;

@Getter
@Setter
public class MainPoliceDepartment extends PoliceUnit {

    private String commander = "Papała";
    private Dimension area = new Dimension(200,100);

    public String getCommander() {
        return commander;
    }

    public Dimension getArea() {
        return area;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
