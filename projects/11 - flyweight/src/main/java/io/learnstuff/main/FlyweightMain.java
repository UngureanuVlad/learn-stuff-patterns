package io.learnstuff.main;

import io.learnstuff.implementation.Flyweight;
import io.learnstuff.implementation.contract.Service;
import io.learnstuff.model.GreatService;
import io.learnstuff.model.NiceService;

public class FlyweightMain {

    public static void main(String[] args) {
        Flyweight.addService("nice", new NiceService());
        Flyweight.addService("great", new GreatService());

        Service service = Flyweight.getService("nice");
        service.perform();
    }
}
