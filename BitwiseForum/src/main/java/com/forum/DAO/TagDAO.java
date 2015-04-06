package com.forum.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Repository;

import com.forum.entities.Tags;

@Repository
public class TagDAO {
	@PersistenceContext
	private EntityManager em;

	public void addTag(Tags tags) {
		em.persist(tags);
		
	}
	public Tags findByName(String name)
	{
		TypedQuery<Tags> query=em.createNamedQuery("Tags.findByName", Tags.class).setParameter("tagName", name);
		return query.getSingleResult(); 
	}
}