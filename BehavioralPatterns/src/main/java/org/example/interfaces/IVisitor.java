package org.example.interfaces;

import org.example.entity.ABW;
import org.example.entity.MainPoliceDepartment;
import org.example.entity.PoliceDepartment;
import org.example.entity.PoliceDistrict;

import java.util.List;

public interface IVisitor {
    void visit(List<PoliceUnit> units);
    void visit(PoliceUnit unit);
    void visit(PoliceDistrict policeDistrict);
    void visit(PoliceDepartment policeDepartment);
    void visit(MainPoliceDepartment mainPoliceDepartment);
    void visit(ABW abw);
}
