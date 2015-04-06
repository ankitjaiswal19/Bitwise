package com.forum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.forum.entities.Comment;
import com.forum.service.CommentService;

@Controller
public class CommentController {
	@Autowired
	private CommentService commentservice;

	@RequestMapping(value = "/comment", method = RequestMethod.GET)
	public ModelAndView abc() {
		ModelAndView model = new ModelAndView("post");
		return model;
	}

	@RequestMapping(value = "/addcmt", method = RequestMethod.POST)
	public ModelAndView xyz(
			@RequestParam(value = "text") String text,
			@RequestParam(value = "post_id") Integer postId,
			@RequestParam(value = "reply_id") Integer replyId) {
		
		
		Comment comment = new Comment();
		CommentService cs = new CommentService();
		comment.setText(text);
		if (postId != null) {
			cs.addCommentOnPost(postId,comment);
		}
		if (replyId != null) {
			cs.addCommentOnReply( replyId,comment);
		}
		
		

		ModelAndView model = new ModelAndView("post");
		return model;
		// commentservice.addComment(comment);
		
		
		
//		String str = cs.getString();
		/*List<Comment> comments = cs.getComments(post.getPostId());
		
		model.addObject("comments", comment);
		
        List<Reply> reply = cs.getReply(post.getReplyId());
		
		model.addObject("replys", reply);*/
		
	}
}
