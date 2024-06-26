package org.example.services.visitor;

import org.example.entity.ABW;
import org.example.entity.MainPoliceDepartment;
import org.example.entity.PoliceDepartment;
import org.example.entity.PoliceDistrict;
import org.example.interfaces.IVisitor;
import org.example.interfaces.PoliceUnit;

import java.util.List;

public class AreaVisitor implements IVisitor {

    @Override
    public void visit(List<PoliceUnit> units) {
        for(PoliceUnit unit: units) {
            visit(unit);
        }
    }

    @Override
    public void visit(PoliceUnit unit) {
        unit.accept(this);
    }

    @Override
    public void visit(PoliceDistrict policeDistrict) {
        System.out.println("Police district: " + policeDistrict.getSurface());
    }

    @Override
    public void visit(PoliceDepartment policeDepartment) {
        System.out.println("Police department: " + policeDepartment.getLength() + policeDepartment.getWidth());
    }

    @Override
    public void visit(MainPoliceDepartment mainPoliceDepartment) {
        System.out.println("Main police department: " + mainPoliceDepartment.getArea());
    }

    @Override
    public void visit(ABW abw) {
        System.out.println("ABW: All country");
    }
}
