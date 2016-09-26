package com.groupfive.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	@RequestMapping("/")
	public ModelAndView home(HttpServletRequest request, ModelAndView mv){
//		if(request.getParameter("name") != null){
//			mv.addObject("name", request.getParameter("name"));
//		}//end if statement
		mv.setViewName("home");
		return mv;
	}//endModelAndView Home Page
	
	
	@RequestMapping("/developercontact")
	public ModelAndView developercontact(HttpServletRequest request, ModelAndView mv){
//		if(request.getParameter("name") != null){
//			mv.addObject("name", request.getParameter("name"));
//		}//end if statement
		mv.setViewName("developercontact");
		return mv;
	}//endModelAndView Developer Contact Page
	
	@RequestMapping("/fieldofficelocation")
	public ModelAndView fieldofficelocation(HttpServletRequest request, ModelAndView mv){
//		if(request.getParameter("name") != null){
//			mv.addObject("name", request.getParameter("name"));
//		}//end if statement
		mv.setViewName("fieldofficelocation");
		return mv;
	}//endModelAndView Developer Contact Page

}//end class
