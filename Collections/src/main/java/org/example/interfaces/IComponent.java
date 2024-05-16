package org.example.interfaces;

import java.util.List;

public interface IComponent {
    void addElement(IComponent c);
    void deleteElement(int i);
    List<IComponent> getElements();
    int countElements();
    void writeInfo();
    IComponentIterator getIterator();
}
