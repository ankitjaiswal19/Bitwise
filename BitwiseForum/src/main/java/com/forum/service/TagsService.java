package com.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.forum.DAO.TagDAO;
import com.forum.entities.Tags;

@Service
public class TagsService {

	@Autowired
	TagDAO tagDAO;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addTagsService(Tags tags) {
		System.out.println("Service Called..");
		tagDAO.addTag(tags);
	}
	public Tags findByName(String name) {
		return tagDAO.findByName(name);
	}
	public List<Tags> findAllTags()
	{
		return tagDAO.findAllTags();
	}
	public Tags findById(int id) {
		
		return tagDAO.findById(id);
	}
}
