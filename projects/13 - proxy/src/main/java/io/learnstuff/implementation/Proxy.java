package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.Service;
import io.learnstuff.model.HeavyService;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Optimize use of memory and reduce heavy objects creation.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class Proxy implements Service {

    HeavyService heavyService = null;

    @Override
    public void perform() {
        if (heavyService == null) {
            System.out.println("Create Heavy Service!");
            heavyService = new HeavyService();
        } else {
            System.out.println("Heavy Service already created!");
        }
        heavyService.perform();
    }
}
