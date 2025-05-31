package io.learnstuff.implementation.contract;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Compose complex functionalities, using simpler building blocks.</li>
 * 	<li>Provides the main steps of an algorithm, but allows child classes to provide specific details.</li>
 * 	<li>If not all steps are required in all child classes, it breaks Liskov Substitution Principle.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public abstract class TemplateMethod {

    public abstract void start();

    public abstract void finish();

    public abstract void task();

    public void use() {
        this.start();
        this.task();
        this.finish();
    }
}
