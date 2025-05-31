package io.learnstuff.main;

import io.learnstuff.implementation.ComplexPrototype;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Cloning complex objects with circular references might be problematic.</li>
 * 	<li>Complex/heavy objects should be used only when absolutely necessary.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class PrototypeMain {

    public static void main(String[] args) {

        ComplexPrototype complexPrototype = new ComplexPrototype();
        complexPrototype.complexProcess();

        ComplexPrototype complexPrototype2 = (ComplexPrototype) complexPrototype.instance();
        complexPrototype2.complexProcess();
    }

}
