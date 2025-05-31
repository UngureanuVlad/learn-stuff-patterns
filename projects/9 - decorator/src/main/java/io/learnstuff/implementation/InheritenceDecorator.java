package io.learnstuff.implementation;

import io.learnstuff.model.Original;

public class InheritenceDecorator extends Original {

    public void doExtendedWork() {
        this.extendedWork();
        super.work();
    }

    public void extendedWork() {
        System.out.print("Extended: ");
    }
}
