package com.poscodx.container.user;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class User {
	private Long no = 0L;
	private String name = "둘리";
	private Friend friend = null;
	private List<String> friends = null;

	// Constructor
	public User() {
	}

	public User(String name) {
		this.name = name;
	}

	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}

	// toString
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + ", friends=" + friends + "]";
	}

	// getter&setter
	public Long getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

}
