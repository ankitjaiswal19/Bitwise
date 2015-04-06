package com.forum.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.forum.entities.User;

@Repository
public class UserDAO {
	
	@PersistenceContext
    private EntityManager em;

//EntityManagerFactory emf = Persistence.createEntityManagerFactory("mypersistanceunit");
	
	@Transactional
	public void addUser(User user)
	{
		em.persist(user);
	}
	@Transactional
	public User findUserByEmail(String email) {
		TypedQuery<User> ubyname=em.createNamedQuery("User.findByEmail",User.class);
		ubyname.setParameter("email", email);
		User result= ubyname.getSingleResult();
		//System.out.println(result);
		return result;
	}
}
