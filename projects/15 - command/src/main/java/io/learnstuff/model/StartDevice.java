package io.learnstuff.model;

import io.learnstuff.implementation.contact.Operations;

public class StartDevice implements Operations {
    private Device device;

    public StartDevice(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.start();

    }

}
