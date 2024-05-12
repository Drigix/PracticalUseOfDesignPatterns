package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.IComponent;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Car implements IComponent {

    private String name;
    private List<IComponent> children;

    public Car(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public void addElement(IComponent c) {
        children.add(c);
    }
    @Override
    public void deleteElement(int i) {
        children.remove(i);
    }
    @Override
    public List<IComponent> getElements() {
        return children;
    }
    @Override
    public int countElements() {
        return children.size();
    }

    @Override
    public void writeInfo() {
//        for(IComponent child: children) {
//            child.writeInfo();
//        }
        System.out.println(name + " " + countElements());
    }
}
