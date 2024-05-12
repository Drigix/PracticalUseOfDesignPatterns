package org.example.services;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.IComponent;
import org.example.interfaces.IComponentIterator;

import java.util.List;

@Getter
@Setter
public class ComponentIterator  implements IComponentIterator {

    private IComponent component;
    private Integer position = 0;

    public ComponentIterator(IComponent component) {
        this.component = component;
    }

    @Override
    public boolean hasNext() {
        return position < component.countElements();
    }

    @Override
    public IComponent getNext() {
        List<IComponent> components = component.getElements();
        IComponent nextComponent = components.get(position);
        position ++;
        return nextComponent;
    }
}
