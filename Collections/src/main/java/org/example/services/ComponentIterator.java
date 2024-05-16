package org.example.services;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.IComponent;
import org.example.interfaces.IComponentIterator;


@Getter
@Setter
public class ComponentIterator implements IComponentIterator {

    private IComponent component;
    private Integer position = 0;
    private IComponent pointerChild;

    public ComponentIterator(IComponent component) {
        this.component = component;
    }

    @Override
    public boolean hasNext() {
        return position + 1 < component.getElements().size();
    }

    @Override
    public IComponent getNext() {
        if (component.getElements().isEmpty()) return null;

        if (pointerChild == null) {
            position = 0;
            pointerChild = component.getElements().get(position);
            return pointerChild;
        }

        IComponent childComponent = pointerChild.getIterator().getNext();
        if (childComponent == null) {
            if (!hasNext()) return null;
            position++;
            pointerChild = component.getElements().get(position);
            return pointerChild;
        }
        return childComponent;
    }
}
