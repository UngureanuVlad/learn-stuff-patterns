package ro.learnstuff.implementation;

public class FrontController {

	static Dispatcher dispatcher = new Dispatcher();
	
	public static void processRequest(String request, String authenticationStatus){
		if ("authenticated".equals(authenticationStatus)){
			dispatcher.dispatch(request);
		} else {
			dispatcher.dispatch("login");
		}
		
	}
}
