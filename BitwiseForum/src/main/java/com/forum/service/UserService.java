package com.forum.service;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.forum.DAO.UserDAO;
import com.forum.entities.User;

@Service
public class UserService {

	@Autowired
	UserDAO userDAO;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addUser(User user) {
		userDAO.addUser(user);
	}

	@Transactional
	public User findByEmail(String email) {
		try {
			return userDAO.findUserByEmail(email);
		} catch (NoResultException noResultException) {
			return null;
		}
	}
}
