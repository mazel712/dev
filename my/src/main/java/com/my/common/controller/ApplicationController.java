package com.my.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationController {

	@RequestMapping("timeout")
	public ModelAndView timeout(){
		return new ModelAndView("timeout");
	}

	@RequestMapping("loggedout")
	public ModelAndView loggedout(){
		return new ModelAndView("loggedout");
	}
}
