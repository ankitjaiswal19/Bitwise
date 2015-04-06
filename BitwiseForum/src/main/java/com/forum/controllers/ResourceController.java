/*package com.forum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ResourceController {
	@RequestMapping(value="/css/{name}")
	public ModelAndView css(@PathVariable("name") String name)
	{
		System.out.println(name);
		return new ModelAndView("home");
	}
	@RequestMapping(value="/css/{name}")
	public ModelAndView css(@PathVariable("name") String name)
	{
		System.out.println("/css/"+name+".css");
		return new ModelAndView("/css/"+name+".css");
	}
	

}
*/