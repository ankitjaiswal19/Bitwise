package com.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.forum.DAO.ReplyDAO;
import com.forum.entities.Post;
import com.forum.entities.Reply;

@Service
public class ReplyService {

	
		@Autowired
		ReplyDAO replyDAO;
		
		
		@Transactional(propagation=Propagation.REQUIRES_NEW)
		public void addReplyService(Reply reply){
			
			// of user.getBatch > silver
			System.out.println("Service Called..");
			replyDAO.addReply(reply);
		}
		
		public Reply findById(int id) {
		return replyDAO.findById(id);
		}
		public List<Reply> findByPost(Post post) {
			return replyDAO.findByPost(post); 
		}

	}


