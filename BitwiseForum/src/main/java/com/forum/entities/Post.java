package com.forum.entities;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "post123")
@NamedQueries({
	 @NamedQuery(name="Post.Search",
            query="Select e " + "from Post e " + "where e.postText LIKE :search"),
            @NamedQuery(name="allPost",
            query="Select p from Post p"),
            @NamedQuery(name="Post.myPost",
            query="Select p from Post p where p.owner = :ownerId")
})

public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int postId;
	private String title;
	@ManyToOne//(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner")
	private User owner;
	private String postText;
	@Temporal(TemporalType.TIMESTAMP)
	private Date postDate;
	

//	@OneToMany(mappedBy = "post")
//	private Collection<Comment> comments = new HashSet<Comment>();
//
//	@OneToMany(mappedBy = "post")
//	private Collection<Reply> reply = new HashSet<Reply>();
	
	

	@ManyToMany(mappedBy="post")
//	@JoinColumn(name="tags")
	private Collection<Tags> tags =new ArrayList<Tags>();
	
	public Post() {
	}
	
	public void addtag(Tags t)
	{
		tags.add(t);
	}

//	public Comment createComment() {
//		Comment c = new Comment();
//		c.setPost(this);
//		comments.add(c);
//		return c;
//	}
//
//	public Reply createReply() {
//		Reply r = new Reply();
//		r.setPost(this);
//		reply.add(r);
//		return r;
//	}



//	public Collection<Reply> getReply() {
//		return reply;
//	}
//
//	public void setReply(Collection<Reply> reply) {
//		this.reply = reply;
//	}
//
//	public Collection<Comment> getComments() {
//		return comments;
//	}
//
//	public void setComments(Collection<Comment> comments) {
//		this.comments = comments;
//	}

	public Collection<Tags> getTags() {
		return tags;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", title=" + title + ", owner="
				+ owner + ", postText=" + postText + ", postDate=" + postDate
				+ ", tags=" + tags + "]";
	}

	public void setTags(Collection<Tags> tags) {
		this.tags = tags;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getPostText() {
		return postText;
	}

	public void setPostText(String postText) {
		this.postText = postText;
	}

	public Date getPostDate() {
		
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	
//	public void setTagType(Collection<Tags> tagType) {
//		this.tags=tagType;
//		
//	}
}
