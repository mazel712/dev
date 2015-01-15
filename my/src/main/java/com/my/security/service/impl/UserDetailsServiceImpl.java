package com.my.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.my.login.service.LoginService;
import com.my.security.service.AssemblerService;
import com.my.user.model.UserModel;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private LoginService loginService; 
	@Autowired
    private AssemblerService assemblerService;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub UserAccount userAccount =
		// userDao.findByUsername(username);
		UserModel userAccount = loginService.findByUsername(username);
		System.out.println("=======================================================>"+username);
		if (userAccount == null) {
			throw new UsernameNotFoundException("user not found");
		}

		return assemblerService.buildUserFromUserEntity(userAccount);
	}

}
