package com.my.login.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.portlet.ModelAndView;

@RestController
public class LoginController {

	@RequestMapping(value="login",method=RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("login");
	}
}
