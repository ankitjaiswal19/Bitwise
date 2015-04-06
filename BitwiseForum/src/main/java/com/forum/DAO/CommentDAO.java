package com.forum.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.forum.entities.Comment;
import com.forum.entities.Post;
import com.forum.entities.Reply;

@Repository
public class CommentDAO {
	
	@PersistenceContext
    private EntityManager em;
	
	@Transactional
	public void addComment(Comment comment)
	{
		em.persist(comment);	
	}
	@Transactional
	public List<Comment> findByPost(Post post)
	{
		return em.createNamedQuery("Comment.findByPost").setParameter("post", post).getResultList();
	}
	public List<Comment> findByReply(Reply reply) {
		// 
		return em.createNamedQuery("Comment.findByReply").setParameter("reply", reply).getResultList();
	}
}
