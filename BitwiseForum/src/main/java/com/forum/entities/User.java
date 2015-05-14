package com.forum.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "User323")
@NamedQueries({
	 @NamedQuery(name="User.findByEmail",
             query="SELECT u FROM User u WHERE u.Email = :email"),
})

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String name;
	private String Password;
	@Column(unique=true)
	private String Email;
	
	private String active_Status;
	
	public String getActive_Status() {
		return active_Status;
	}

	public void setActive_Status(String active_Status) {
		this.active_Status = active_Status;
	}

	public int getUserId() {
		return userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", Name=" + name + ", Password="
				+ Password + ", Email=" + Email + ", Active_Status="
				+ active_Status + "]";
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
}
