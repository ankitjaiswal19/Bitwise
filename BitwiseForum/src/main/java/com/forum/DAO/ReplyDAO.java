package com.forum.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import oracle.net.aso.p;
import oracle.net.aso.r;

import org.springframework.stereotype.Repository;

import com.forum.entities.Post;
import com.forum.entities.Reply;

@Repository
public class ReplyDAO {
	
	@PersistenceContext
    private EntityManager em;
	
	public void addReply(Reply reply)
	{
		em.persist(reply);
//		System.out.println("DAO Called..");
	}
	public Reply findById(int id)
	{
		return em.find(Reply.class, id);
		
	}
	public List<Reply> findByPost(Post post) {
		return em.createNamedQuery("Reply.findByPost").setParameter("post", post).getResultList();
	}
}