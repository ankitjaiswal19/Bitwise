package com.forum.entities;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

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

//	@OneToMany(mappedBy = "owner")
//	private Collection<Post> post=new HashSet<Post>();
//
//	public Post createPost() {
//		Post p = new Post();
//		p.setOwner(this);
//		post.add(p);
//		return p;
//	}
	
	public int getUserId() {
		return userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", Password="
				+ Password + ", Email=" + Email + "]";
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

//	public Collection<Post> getPost() {
//		return post;
//	}
//
//	public void setPost(Collection<Post> post) {
//		this.post = post;
//	}	
}
