package com.poscodx.container.user;

public class Friend {
	private String name;

	// Constructor
	public Friend(String name) {
		this.name = name;
	}

	// toString
	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}

}
