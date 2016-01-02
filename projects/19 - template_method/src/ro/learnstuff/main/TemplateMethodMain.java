package ro.learnstuff.main;

import ro.learnstuff.implementation.PublicDevice;
import ro.learnstuff.implementation.SecureDevice;
import ro.learnstuff.implementation.contract.TemplateMethod;

public class TemplateMethodMain {

	public static void main(String[] args){
		TemplateMethod template = new PublicDevice();
		template.use();
		
		template = new SecureDevice();
		template.use();
	}
}
