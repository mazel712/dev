package com.my.security.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.my.common.model.RoleInfo;
import com.my.security.service.AssemblerService;
import com.my.user.model.UserModel;

@Service("assemblerService")
public class AssemblerServiceImpl implements AssemblerService {
	
	@Transactional(readOnly = true)
	@Override
	public User buildUserFromUserEntity(UserModel userAccount) {
		String username = userAccount.getLoginName();
		String password = userAccount.getPassword();
		boolean enabled = true;// userAccount.isActive();
		boolean accountNonExpired = enabled;
		boolean credentialsNonExpired = enabled;
		boolean accountNonLocked = enabled;

		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (RoleInfo role : userAccount.getRoles()) {
			authorities.add(new SimpleGrantedAuthority(role.getName()));
		}

		User user = new User(username, password, enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, authorities);
		return user;
	}
}
