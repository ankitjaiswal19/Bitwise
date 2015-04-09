package com.forum.DAO;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.forum.entities.Post;
import com.forum.entities.Tags;
import com.forum.entities.User;

@Repository
public class PostDAO {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void addPost(Post post) {
		em.persist(post);
		Collection<Tags> tags= post.getTags();
		if(tags!=null)
		for (Iterator iterator = tags.iterator(); iterator.hasNext();) {
			Tags tags2 = (Tags) iterator.next();
			tags2.addPost(post);
			em.merge(tags2);
		}
		
		em.flush();
		System.out.println(post.getTags());
	}
	@Transactional
	public List<Post> findbysearch(String search) {
		TypedQuery<Post> query1 = em
				.createNamedQuery("Post.Search", Post.class).setParameter(
						"search", "%" + search + "%");
		List<Post> list1 = query1.getResultList();
		return list1;
	}
	
	public Post findById(int id) {
		Post p=em.find(Post.class, id);
		return p;
	}
	public List<Post> findAllPost()
	{
		TypedQuery<Post> query2 = em
				.createNamedQuery("allPost", Post.class);
		List<Post> list2 = query2.getResultList();
		return list2;
	}
	public List<Post> myPost(User user)
	{	System.out.println(user);
		TypedQuery<Post> query1 = em
				.createNamedQuery("Post.myPost", Post.class).setParameter("ownerId", user);
		System.out.println();
		List<Post> list = query1.getResultList();
		System.out.println(list);
		return list;
	}
}
