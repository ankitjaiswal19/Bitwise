package com.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.forum.DAO.PostDAO;
import com.forum.entities.Post;
import com.forum.entities.User;

@Service
public class PostService {

	@Autowired
	PostDAO postDAO;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addPostService(Post post) {
		postDAO.addPost(post);
	}

	public Post findPost(int id) {
		return postDAO.findById(id);
	}

	public List<Post> findPost(String topic) {
		return postDAO.findbysearch(topic);

	}
	public List<Post> findAllPost()
	{
		return postDAO.findAllPost();
	}
	public List<Post> findMyPost(User user) {
		return postDAO.myPost(user);
	}

	
}
