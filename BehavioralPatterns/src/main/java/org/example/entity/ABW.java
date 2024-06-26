package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.IVisitor;
import org.example.interfaces.PoliceUnit;

@Getter
@Setter
public class ABW extends PoliceUnit {

    private int area;

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
