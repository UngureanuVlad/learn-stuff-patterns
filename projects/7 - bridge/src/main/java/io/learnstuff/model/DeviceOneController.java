package io.learnstuff.model;

import io.learnstuff.implementation.contract.Operations;

public class DeviceOneController implements Operations {

    @Override
    public void turnOn() {
        System.out.println("Type one - turn on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Type one - turn off!");
    }

}
