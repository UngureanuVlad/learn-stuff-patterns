package ro.learnstuff.implementation.contract;

import ro.learnstuff.model.ComplexClass;

/**
 * <p>We assume that creation of target object can be made in different ways, using diverse and complex operations.
 * in this context, we define an interface to help us standardize the building process.</p>
 * 
 * <p>Note: In this situation, the builder just hides the complexity of building an object.</p>
 * 
 * 
 * @author Vlad Ungureanu
 *
 */
public interface BuilderInterface {

	void buildAuthorization(String authorization);

	void buildCredentials(String credentials);

	void buildRoles(String roles);

	void buildProperties(String properties);
	
	ComplexClass getComplexClass();
}
