package com.forum.controllers;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.forum.entities.Comment;
import com.forum.entities.Post;
import com.forum.entities.Tags;
import com.forum.entities.User;
import com.forum.service.CommentService;
import com.forum.service.PostService;
import com.forum.service.TagsService;
import com.forum.service.UserService;

@Controller
public class PostController {

    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;
    @Autowired
    private TagsService tagsService;
    @Autowired
    private CommentService commentService;
    
//	@RequestMapping(value="/home", method= RequestMethod.GET)
//	public ModelAndView openHome()
//	{
//		 ModelAndView model=new ModelAndView("Home");
//		 return model;
//	}
//	
	/*@RequestMapping(value="/login", method= RequestMethod.POST)
	public ModelAndView openLogin(
			@RequestParam(value="uname") String username,
			@RequestParam(value="upass") String password)
	    {
		Post post= new Post();
		
		 ModelAndView model=new ModelAndView("");
			
		
		 return model;
	    }
	*/
	
    @RequestMapping(value="/createPost",method=RequestMethod.GET)
    public ModelAndView getCreatePost(@RequestParam(value="email") String email)
    {
    	ModelAndView modelAndView=null;
    	if(email!=null){
    	User user=userService.findByEmail(email);
    	modelAndView =new ModelAndView("CreatePost");
    	modelAndView.addObject("user", user);
    	modelAndView.addObject("tagsList", tagsService.findAllTags());
    	}
    	else {
			modelAndView=new ModelAndView("LoginPage");
		}
    	return modelAndView;
    }
    @RequestMapping(value="/addpost", method= RequestMethod.POST)
	public ModelAndView getPostInfo(
			@RequestParam Map<String, Object> params)
            {
    		 return new ModelAndView("redirect:/home");
		    
            }
    
    @RequestMapping(value="/viewpost", method= RequestMethod.GET)
    public ModelAndView ViewPost(@RequestParam(value="id") int id){
    	 ModelAndView model = new ModelAndView("PostDisp");
    	 List<Comment> postComments=commentService.findByPostId(id);
    	 model.addObject("postComments",postComments);
    	 model.addObject("post", postService.findPost(id));	
    	 //postService.findPost(user.getUserId());
    	  return model;
		} 
}
