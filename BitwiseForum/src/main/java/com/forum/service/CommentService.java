package com.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.forum.DAO.CommentDAO;
import com.forum.DAO.PostDAO;
import com.forum.DAO.ReplyDAO;
import com.forum.entities.Comment;
import com.forum.entities.Post;
import com.forum.entities.Reply;

@Service
public class CommentService {
	
	@Autowired
	CommentDAO commentDAO;
	@Autowired
	ReplyService replyService;
	@Autowired
	PostService postService;
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void addCommentOnPost(int id,Comment comment){
		
		// of user.getBatch > silver
		//System.out.println("Service Called..");
		comment.setPost(postService.findPost(id));
		commentDAO.addComment(comment);
	}
	public void addCommentOnReply(int id,Comment comment) {
		
		comment.setReply(replyService.findById(id));
		commentDAO.addComment(comment);
	}
	public List<Comment> findByPost(Post post) {
		return commentDAO.findByPost(post);
	}
	public List<Comment> findByReply(Reply reply) {
		return commentDAO.findByReply(reply);
	}
	
	


}
