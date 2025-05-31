package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.Service;

import java.util.HashMap;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Implementation complexity makes this pattern less approachable.</li>
 * 	<li>It's meant to optimize creation and memory usage of large objects, but it may come at the cost of CPU.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class Flyweight {

    private static final HashMap<String, Service> services = new HashMap<>();

    public static Service getService(String type) {
        return services.get(type);
    }

    public static void addService(String type, Service service) {
        services.put(type, service);
    }
}
