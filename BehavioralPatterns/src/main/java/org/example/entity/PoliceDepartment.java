package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.IVisitor;
import org.example.interfaces.PoliceUnit;

@Getter
@Setter
public class PoliceDepartment extends PoliceUnit {

    private String commanderSurname = "Adamski";
    private int length = 10;
    private int width = 20;

    public String getCommanderSurname() {
        return commanderSurname;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
