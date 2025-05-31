package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.BuilderInterface;
import io.learnstuff.model.ComplexClass;

public class AdminBuilder implements BuilderInterface {

    private ComplexClass complexClass;

    public AdminBuilder() {
        this.complexClass = new ComplexClass();
    }

    @Override
    public void buildAuthorization(String authorization) {
        complexClass.setAuthorization(authorization);
    }

    @Override
    public void buildCredentials(String credentials) {
        complexClass.setCredentials(credentials);
    }

    @Override
    public void buildRoles(String roles) {
        complexClass.setRoles(roles);
    }

    @Override
    public void buildProperties(String properties) {
        complexClass.setProperties(properties);
    }

    @Override
    public ComplexClass getComplexClass() {
        return this.complexClass;
    }

}
