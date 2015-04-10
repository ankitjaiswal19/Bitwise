package com.forum.controllers;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

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
    @SuppressWarnings("unchecked")
	@RequestMapping(value="/addpost", method= RequestMethod.POST)
	public ModelAndView getPostInfo(
			@RequestParam Map<String, Object> params)
            {
    		 Post post= new Post(); 
    		 if(params.get("tag")!=null)
    		 post.setTags((Collection<Tags>)params.get("tag"));
    		 else{
    			 post.setTags(null);
    		 }
//    		 post.setPostId(id);
    		 post.setTitle((String)params.get("postTitle"));
    		 post.setOwner(userService.findByEmail((String)params.get("email")));
    		 post.setPostText((String)params.get("postText"));
    		 post.setPostDate(new Date());
    		 System.out.println(post);
    		 postService.addPostService(post);
    		 ModelAndView model = new ModelAndView("HomePage");

    		 
//    	    	System.out.println("posted");
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
