package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Compose simple building blocks into complex functionalities.</li>
 * 	<li>Some application features benefits greatly from this design pattern.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class Composite {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        this.components.add(component);
    }

    public void remove(Component component) {
        this.components.remove(component);
    }

    public void work() {
        for (Component component : this.components) {
            component.work();
        }

    }
}
