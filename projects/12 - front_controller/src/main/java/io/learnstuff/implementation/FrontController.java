package io.learnstuff.implementation;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Default, out-of-the-box implementation for most web development frameworks.</li>
 * 	<li>Very difficult to obtain the same effect with other patterns..</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class FrontController {

    static Dispatcher dispatcher = new Dispatcher();

    public static void processRequest(String request, String authenticationStatus) {
        if ("authenticated".equals(authenticationStatus)) {
            dispatcher.dispatch(request);
        } else {
            dispatcher.dispatch("login");
        }

    }
}
