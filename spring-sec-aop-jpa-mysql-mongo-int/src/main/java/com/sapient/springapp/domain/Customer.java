package com.sapient.springapp.domain;

import java.io.Serializable;
import org.springframework.data.annotation.Id;


/**
 * Domain obj. to store customer information
 * @author Karthik Rao
 *
 */
public class Customer implements Serializable {

	private static final long serialVersionUID = -14230031022377989L;

	@Id
    private String id;

    private String firstName;
    private String lastName;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}

