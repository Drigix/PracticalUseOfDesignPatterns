package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.IComponent;
import org.example.interfaces.IComponentIterator;
import org.example.services.ComponentIterator;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Location implements IComponent {

    private String name;
    private List<IComponent> children;
    private IComponentIterator iterator;

    public Location(String name) {
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
        int sum = 0;
        for(IComponent child: children) {
            sum += child.countElements();
        }
        return sum;
    }
    @Override
    public void writeInfo() {
//        for(IComponent child: children) {
//            child.writeInfo();
//        }
        System.out.println(name + " " + countElements());
    }

    @Override
    public IComponentIterator getIterator() {
        if(iterator == null) {
            iterator = new ComponentIterator(this);
        }
        return iterator;
    }
}
