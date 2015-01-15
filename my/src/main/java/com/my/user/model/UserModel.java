package com.my.user.model;

import java.util.Set;

import com.my.common.model.RoleInfo;
import com.my.common.model.UserInfo;

public class UserModel extends UserInfo {

	private Set<RoleInfo> roles;

	public Set<RoleInfo> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleInfo> roles) {
		this.roles = roles;
	}
}
