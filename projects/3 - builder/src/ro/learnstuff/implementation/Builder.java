package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contract.BuilderInterface;
import ro.learnstuff.model.ComplexClass;

public class Builder {
	private BuilderInterface builderInterface;

	public Builder(BuilderInterface builderInterface){
		this.builderInterface = builderInterface;
	}

	public ComplexClass getComplexClass() {
		return this.builderInterface.getComplexClass();
	}

	public void build(String authorization, String credentaials, String roles, String properties) {
		this.builderInterface.buildAuthorization(authorization);
		this.builderInterface.buildCredentials(credentaials);
		this.builderInterface.buildRoles(roles);
		this.builderInterface.buildProperties(properties);
	}
}
