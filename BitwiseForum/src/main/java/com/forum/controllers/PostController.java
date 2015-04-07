package com.forum.controllers;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.forum.entities.Post;
import com.forum.entities.Tags;
import com.forum.entities.User;
import com.forum.service.PostService;

@Controller
public class PostController {

    @Autowired
    private PostService postService;
    

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
	
    
    @RequestMapping(value="/addpost", method= RequestMethod.POST)
	public ModelAndView getPostInfo(
			@RequestParam(value="tags") Collection<Tags> tags,
			@RequestParam(value="id") int id,
			@RequestParam(value="title") String post_title,
			@RequestParam(value="owner") User post_owner,
		  	@RequestParam(value="postText") String post_text,
			@RequestParam(value="postdate") Date post_date)
	       
            {
    		 Post post= new Post(); 
    		 post.setTags(null);
    		 post.setPostId(id);
    		 post.setTitle(post_title);
    		 post.setOwner(post_owner);
    		 post.setPostText(post_text);
    		 post.setPostDate(new Date());
    		 
    		 ModelAndView model = new ModelAndView("home");

    		 postService.addPostService(post);
    	    	System.out.println("posted");
    	    	//ModelAndView model=null;
    			return model;
		    
            }
    
    @RequestMapping(value="/ViewpostbyId", method= RequestMethod.POST)
    public ModelAndView ViewPost(@RequestParam(value="id") int id){
    	
    	User user=new User();
    	user.setUserId(id);
    	Post post=new Post();
    	
    	 ModelAndView model = new ModelAndView("view");
    	 postService.findPost(user.getUserId());
    	  return model;
		} 
}
