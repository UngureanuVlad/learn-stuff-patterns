package io.learnstuff.main;


import io.learnstuff.implementation.DynamicProxy;
import io.learnstuff.implementation.Proxy;
import io.learnstuff.implementation.contract.Service;
import io.learnstuff.model.HeavyService;

public class ProxyMain {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        proxy.perform();
        proxy.perform();

        Service dynamicProxy = (Service) DynamicProxy.newInstance(new HeavyService());
        dynamicProxy.perform();
    }
}
