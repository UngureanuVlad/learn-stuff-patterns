package io.learnstuff.main;

import io.learnstuff.implementation.PublicDevice;
import io.learnstuff.implementation.SecureDevice;
import io.learnstuff.implementation.contract.TemplateMethod;

public class TemplateMethodMain {

    public static void main(String[] args) {
        TemplateMethod template = new PublicDevice();
        template.use();

        template = new SecureDevice();
        template.use();
    }
}
