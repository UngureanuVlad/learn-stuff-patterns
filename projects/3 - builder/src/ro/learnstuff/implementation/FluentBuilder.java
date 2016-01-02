package ro.learnstuff.implementation;

import ro.learnstuff.model.ComplexClass;

/**
 * 
 * @author Vlad Ungureanu
 *
 */
public class FluentBuilder {

	protected ComplexClass complexClass;

	private String authorization;
	private String credentials;
	private String roles;
	private String properties;

	public FluentBuilder beingAuthorizated(String authorization) {
		this.authorization = authorization;
		return this;
	}

	public FluentBuilder havingCredenatials(String credentials) {
		this.credentials = credentials;
		return this;
	}

	public FluentBuilder havingRoles(String roles) {
		this.roles = roles;
		return this;
	}

	public FluentBuilder basedOnProperties(String properties) {
		this.properties = properties;
		return this;
	}

	public ComplexClass build() {
		complexClass = new ComplexClass();
		complexClass.setAuthorization(this.authorization);
		complexClass.setCredentials(this.credentials);
		complexClass.setRoles(this.roles);
		complexClass.setProperties(this.properties);
		return complexClass;
	}

}
