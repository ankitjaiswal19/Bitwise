package com.forum.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.forum.entities.User;
import com.forum.service.PostService;
import com.forum.service.UserService;

@Controller
@SessionAttributes("user")
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView welcome()
	{
		ModelAndView mav=new ModelAndView("HomePage");
//		mav.addObject("title", "new page");
		mav.addObject("postList", postService.findAllPost());
		return mav;
	}
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView home_Get()
	{
		return new ModelAndView("HomePage");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView registerGet() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}

	@RequestMapping(value = "/getRegistered")
	public ModelAndView welcome(@RequestParam Map<String, String> params,@RequestParam Model model) {
		ModelAndView mav;
		System.out.println("model="+model);
		String uname = params.get("username");
		String pwd = params.get("password");
		String cnfpwd = params.get("confirmPass");
		String email = params.get("email");
		if (pwd.equals(cnfpwd)) {
			mav = loginGet();
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

	@Autowired
	PostService postService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet() {
		ModelAndView modelAndView = new ModelAndView("LoginPage");
		return modelAndView;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPost(@RequestParam Map<String, String> params) {
		System.out.println("login called");
		ModelAndView mav = null;
		String email = params.get("email");
		String pass = params.get("password");
		if (!email.trim().equals("")) {
			User user = userService.findByEmail(email);
			if (user.getPassword().equals(pass)) {
				mav = new ModelAndView("userprofile");
				//System.out.println(postService.findMyPost(user));
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
