package ro.learnstuff.implementation.contracts;

/**
 * 
 * <p>We should use the Abstract Factory design pattern when:</p>
 * <ul>
 * 	<li>the system needs to be independent from the way the products it works with are created.</li>
 *  <li>the system is or should be configured to work with multiple families of products.</li>
 * 	<li>a family of products is designed to work only all together.</li>
 *  <li>the creation of a library of products is needed, for which is relevant only the interface, not the implementation, too.</li>
 *  </ul>
 * 
 * @author Vlad Ungureanu
 *
 */
public interface AbstractFactory {

	SimpleWorker getSimpleWorker();

	ComplexWorker getCompleWorker();
}
