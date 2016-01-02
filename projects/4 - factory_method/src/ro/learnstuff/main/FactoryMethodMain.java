package ro.learnstuff.main;

import ro.learnstuff.implementation.ComplexFactoryMethod;
import ro.learnstuff.implementation.LogicalFactoryMethod;
import ro.learnstuff.model.ComplexClass;

/**
 * <p>Common pitfalls:</p>
 * <ul>
 * 		<li>Adding new way of building a class requires changes in the factory method class.</li>
 * 		<li>Factory methods can hide complexity and time consuming operations.</li>
 * </ul>
 * 
 * @author Vlad Ungureanu
 *
 */
public class FactoryMethodMain {

	public static void main(String[] args){
		ComplexClass complexClass = ComplexFactoryMethod.buildComplexClass("One", "Two", "Three");
		System.out.println(complexClass.getComplexPartThree());
		
		ComplexClass complexClass2 = LogicalFactoryMethod.buildClass("Complex");
		System.out.println(complexClass2.getComplexPartThree());
	}
}
