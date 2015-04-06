package com.forum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView hello()
	{
		ModelAndView mav=new ModelAndView("HomePage");
//		mav.addObject("title", "new page");
		return mav;
	}
	
	
	
	@RequestMapping("/login2")
	public ModelAndView hello2()
	{
		ModelAndView mav=new ModelAndView("hello");
		mav.addObject("title", "21852852852828");
		return mav;
	}
	
	
	
	
/*		this code has been moved to userController*/
	
/*	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView register(){
		System.out.println("in reg controller");
		return new ModelAndView("register");
	}
	
	
	
	
	@RequestMapping(value="/getRegistered", method=RequestMethod.POST)
	public ModelAndView getRegister(
			@RequestParam("username") String username,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("confirmPass") String confirmPass
			){
		System.out.println("in get reg controller");
		
		System.out.println("user is "+username);
		return new ModelAndView("register");
	}
*/	
	
	
	
}
