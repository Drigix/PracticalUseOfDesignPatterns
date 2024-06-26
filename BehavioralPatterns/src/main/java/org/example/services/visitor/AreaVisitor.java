package org.example.services.visitor;

import org.example.entity.MainPoliceDepartment;
import org.example.entity.PoliceDepartment;
import org.example.entity.PoliceDistrict;
import org.example.interfaces.IVisitor;
import org.example.interfaces.PoliceUnit;

import java.util.List;

public class AreaVisitor implements IVisitor {

    @Override
    public void visit(List<PoliceUnit> units) {}

    @Override
    public void visit(PoliceUnit unit) {}

    @Override
    public void visit(PoliceDistrict policeDistrict) {}

    @Override
    public void visit(PoliceDepartment policeDepartment) {}

    @Override
    public void visit(MainPoliceDepartment mainPoliceDepartment) {}
}
