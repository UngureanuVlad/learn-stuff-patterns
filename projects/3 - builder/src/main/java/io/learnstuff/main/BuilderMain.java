package io.learnstuff.main;

import io.learnstuff.implementation.AdminBuilder;
import io.learnstuff.implementation.Builder;
import io.learnstuff.implementation.FluentBuilder;
import io.learnstuff.implementation.UserBuilder;
import io.learnstuff.model.ComplexClass;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Aside from code readability this implementation does not bring any business value.</li>
 * 	<li>Number of objects build with builders is directly proportional to the number of builder classes.</li>
 * 	<li>Changes in the model require changes in the builder.</li>
 * 	<li>Great example of God Class and Feature Envy code smells.</li>
 * 	<li>Encourages copy + paste programming or wrapping in creation methods for usage (especially in tests).</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class BuilderMain {

    public static void main(String[] args) {
        FluentBuilder fluentBuilder = new FluentBuilder();
        ComplexClass complexClass = fluentBuilder.basedOnProperties("properties").havingCredentials("credentials")
                .havingRoles("roles").beingAuthorization("authorization").build();
        System.out.println(complexClass.getAuthorization() + " " + complexClass.getCredentials());

        Builder builder = new Builder(new AdminBuilder());
        builder.build("authorization", "credentials", "roles", "properties");
        ComplexClass complexClass2 = builder.getComplexClass();
        System.out.println(complexClass2.getAuthorization() + " " + complexClass2.getCredentials());

        builder = new Builder(new UserBuilder());
        builder.build("authorization", "credentials", "roles", "properties");
        complexClass2 = builder.getComplexClass();
        System.out.println(complexClass2.getAuthorization() + " " + complexClass2.getCredentials());

    }

}
