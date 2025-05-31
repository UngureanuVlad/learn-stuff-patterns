package io.learnstuff.model;

import io.learnstuff.implementation.contact.Operations;

public class FinishDevice implements Operations {
    private Device device;

    public FinishDevice(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.finish();

    }

}
