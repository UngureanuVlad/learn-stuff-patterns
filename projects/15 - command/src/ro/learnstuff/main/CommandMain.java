package ro.learnstuff.main;

import ro.learnstuff.implementation.Command;
import ro.learnstuff.implementation.contact.Operations;
import ro.learnstuff.model.Device;
import ro.learnstuff.model.FinishDevice;
import ro.learnstuff.model.StartDevice;

public class CommandMain {

	public static void main(String[] args){
		Command command = new Command();
		Device device = new Device();
		Operations start = new StartDevice(device);
		Operations finish = new FinishDevice(device);
		
		command.setCommand(start);
		command.execute();
		
		command.setCommand(finish);
		command.execute();
	}
}
