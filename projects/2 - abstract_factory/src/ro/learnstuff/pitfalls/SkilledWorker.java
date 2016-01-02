package ro.learnstuff.pitfalls;

import ro.learnstuff.implementation.contracts.ComplexWorker;

/**
 * 
 * <p>Adding this new type of worker to the existing implementation code is very difficult as it will lead to
 * changes in all involved classes. If changes are not made then the "skilledWork()" method will not be usable by the client.</p>
 * 
 * <p>Note: Abstract Factory is best used when the number of created object is very unlikely to get modified in the future!</p>
 * 
 * @author Vlad Ungureanu
 *
 */
public interface SkilledWorker extends ComplexWorker{
	
	void skilledWork();
}
