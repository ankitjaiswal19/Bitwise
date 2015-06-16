package com.forum.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name ="Reply123")

@NamedQueries({
	
	 @NamedQuery(name="Reply.findByPost",
           query="SELECT r FROM Reply r WHERE r.post = :post")
})
public class Reply {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int r_id;
	private String text;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name ="Post")
	private Post post;
	@ManyToOne(fetch=FetchType.LAZY)
	private User replier;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date replyDate;
	
	
	@Override
	public String toString() {
		return "Reply [r_id=" + r_id + ", text=" + text + ", post=" + post
				+ ", replier=" + replier + ", replyDate=" + replyDate + "]";
	}
	public Date getReplyDate() {
		return replyDate;
	}
	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}
	public User getReplier() {
		return replier;
	}
	public void setReplier(User replier) {
		this.replier = replier;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	
}
