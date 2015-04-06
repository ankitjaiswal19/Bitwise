package com.forum.entities;

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
	
	
//	@OneToMany(mappedBy="reply")
//	private Collection<Comment> comments=new HashSet<Comment>();
//	
//	public Comment createComment() {
//		Comment c = new Comment();
//		c.setReply(this);
//		comments.add(c);
//		return c;
//	}
	
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
