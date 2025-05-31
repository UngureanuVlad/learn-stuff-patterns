package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.BuilderInterface;
import io.learnstuff.model.ComplexClass;

public class Builder {
    private BuilderInterface builderInterface;

    public Builder(BuilderInterface builderInterface) {
        this.builderInterface = builderInterface;
    }

    public ComplexClass getComplexClass() {
        return this.builderInterface.getComplexClass();
    }

    public void build(String authorization, String credentials, String roles, String properties) {
        this.builderInterface.buildAuthorization(authorization);
        this.builderInterface.buildCredentials(credentials);
        this.builderInterface.buildRoles(roles);
        this.builderInterface.buildProperties(properties);
    }
}
