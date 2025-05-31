package io.learnstuff.implementation;

import io.learnstuff.model.HeavyResource;

import java.io.Serializable;

/**
 * <p> Singleton is usually used for: </p>
 * <ul>
 * 	<li>The Abstract Factory and Builder patterns can use Singletons in their implementation.</li>
 *  <li>Facade objects are often singletons because only one Facade object is required.</li>
 *  <li>State objects are often singletons.</li>
 *  <li>Singletons are often preferred to global variables because:
 *  	<ul>
 *      	<li>They do not pollute the global namespace (or, in languages with namespaces, their containing namespace) with unnecessary variables.</li>
 *      	<li>They permit lazy allocation and initialization, whereas global variables in many languages will always consume resources.</li>
 *      <ul>
 *  </li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class Singleton implements Serializable {

    // thread safe static resource
    private static final ThreadLocal<HeavyResource> heavyResource = new ThreadLocal<>();

    // double-checked locking pattern implementation
    public static HeavyResource getHeavyResource() {
        // lazy initialization
        if (heavyResource.get() == null) {
            System.out.println("Initialize resource!");
            synchronized (HeavyResource.class) {
                if (heavyResource.get() == null) {
                    heavyResource.set(new HeavyResource());
                }
            }
        }
        return heavyResource.get();
    }
}
