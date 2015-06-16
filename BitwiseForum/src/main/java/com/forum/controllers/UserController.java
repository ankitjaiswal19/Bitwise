package com.forum.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.forum.entities.User;
import com.forum.service.PostService;
import com.forum.service.TagsService;
import com.forum.service.UserService;

@Controller
public class UserController{
	@Autowired
	UserService userService;
	@Autowired
	TagsService tagsService;
	@Autowired
	PostService postService;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView welcome()
	{
		return new ModelAndView("redirect:/home");
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView home_Get(HttpSession session)
	{
		ModelAndView mav=new ModelAndView("HomePage");
		//mav.addObject("title", "new page");
		mav.addObject("postList", postService.findAllPost());
		mav.addObject("tagsList", tagsService.findAllTags());
		return mav;
		
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView registerGet() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}

	@RequestMapping(value = "/getRegistered")
	public ModelAndView welcome(@RequestParam Map<String, String> params) {
		ModelAndView mav;
	//	System.out.println("model="+model);
		String uname = params.get("username");
		String pwd = params.get("password");
		String cnfpwd = params.get("confirmPass");
		String email = params.get("email");
		if (pwd.equals(cnfpwd)) {
			mav = new ModelAndView("LoginPage");
			User newUser = new User();
			newUser.setName(uname);
			newUser.setPassword(pwd);
			newUser.setEmail(email);
			userService.addUser(newUser);
		} else {
			mav = new ModelAndView("ErrorPage");
			mav.addObject("message", "please enter same password");
		}

		return mav;
	}

	@RequestMapping(value="/logout")
	public ModelAndView logout(HttpServletRequest request)
	{
		HttpSession session=request.getSession();
		session.setAttribute("user", null);
		return new ModelAndView("redirect:/home");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet(HttpSession session) {
		ModelAndView modelAndView = null;
		User user=(User) session.getAttribute("user");
		if(user!=null)
		{
			modelAndView=new ModelAndView("userprofile");
			modelAndView.addObject("user", user);
			modelAndView.addObject("postList", postService.findMyPost(user));
		}
		else {
		modelAndView = new ModelAndView("LoginPage");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPost(@RequestParam Map<String, String> params,HttpSession session) {
		
		//System.out.println("login called");
		ModelAndView mav = null;
		String email = params.get("email");
		String pass = params.get("password");
		if (!email.trim().equals("")) {
			User user = userService.findByEmail(email);
			System.out.println(user);
			if (user!=null&&user.getPassword().equals(pass)) {
				mav = new ModelAndView("userprofile");
				session.setAttribute("user", user);
				mav.addObject("user", user);
				mav.addObject("postList", postService.findMyPost(user));
			} else {
				mav = new ModelAndView("ErrorPage");
				mav.addObject("message", "invalid user");
			}

		}
		return mav;
	}

}
