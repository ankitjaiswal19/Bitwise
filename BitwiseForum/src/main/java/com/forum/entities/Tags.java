package com.forum.entities;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Tags")
@NamedQueries({
		@NamedQuery(name = "Tags.findByName", query = "SELECT t FROM Tags t WHERE t.tagName = :tagName"),
		@NamedQuery(name = "Tags.findAllTags", query = "SELECT t FROM Tags t"),
		})
public class Tags {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tagId;
	@Column(unique = true)
	private String tagName;

	@ManyToMany
	private Collection<Post> post = new ArrayList<Post>();

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public void addPost(Post p) {
		post.add(p);
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Collection<Post> getPost() {
		return post;
	}

	public void setPost(Collection<Post> post) {
		this.post = post;
	}

//	@Override
//	public String toString() {
//		return "Tags [tagId=" + tagId + ", tagName=" + tagName + ", post="
//				+ post + "]";
//	}

}