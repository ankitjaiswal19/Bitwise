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
@Table(name = "Comments123")
@NamedQueries({
	
	 @NamedQuery(name="Comment.findByPost",
            query="SELECT c FROM Comment c WHERE c.post = :post"),
     @NamedQuery(name="Comment.findByReply",
            query="SELECT c FROM Comment c WHERE c.reply = :reply"),
})






public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int c_id;
	private String text;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name ="Post")
	private Post post;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name ="reply")
	private Reply reply;
	@ManyToOne(fetch=FetchType.LAZY)
	private User commenter;
	public User getCommenter() {
		return commenter;
	}
	public void setCommenter(User commenter) {
		this.commenter = commenter;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	@Temporal(TemporalType.DATE)
	private Date commentDate;
	
	public Reply getReply() {
		return reply;
	}
	public void setReply(Reply reply) {
		this.reply = reply;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
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
	@Override
	public String toString() {
		return "Comment [c_id=" + c_id + ", text=" + text + ", post=" + post
				+ ", reply=" + reply + ", commenter=" + commenter
				+ ", commentDate=" + commentDate + "]";
	}
	
	
}
