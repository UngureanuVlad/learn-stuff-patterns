package io.learnstuff.main;

import io.learnstuff.implementation.Command;
import io.learnstuff.implementation.contact.Operations;
import io.learnstuff.model.Device;
import io.learnstuff.model.FinishDevice;
import io.learnstuff.model.StartDevice;

public class CommandMain {

    public static void main(String[] args) {
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
