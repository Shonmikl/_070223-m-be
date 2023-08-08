package org.example._2023_08_08.mockito.dummy;

import lombok.Getter;

@Getter
public class Customer {
	String fname;
	String lName;
	Address address;

	public Customer(String fname, String lName, Address address) {
		this.fname = fname;
		this.lName = lName;
		this.address = address;
	}

	public Customer() {
	}
}