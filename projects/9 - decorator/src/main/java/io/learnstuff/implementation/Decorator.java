package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.Worker;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Compose complex functionalities, using simpler building blocks.</li>
 * 	<li>Used correctly, increase reusability of some functionalities</li>
 * 	<li>Some application features benefits greatly from this design pattern.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class Decorator extends Worker {

    Worker worker;

    public Decorator(Worker worker) {
        this.worker = worker;
    }

    public void work() {
        this.worker.work();
    }
}
